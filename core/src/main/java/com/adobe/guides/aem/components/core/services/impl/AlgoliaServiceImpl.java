package com.adobe.guides.aem.components.core.services.impl;

import com.adobe.guides.aem.components.core.config.AlgoliaConfig;
import com.adobe.guides.aem.components.core.services.AlgoliaService;
import com.algolia.search.DefaultSearchClient;
import com.algolia.search.SearchClient;
import com.algolia.search.SearchIndex;
import com.day.cq.wcm.api.Page;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component(service = AlgoliaService.class)
@Designate(ocd = AlgoliaConfig.class)
public class AlgoliaServiceImpl implements AlgoliaService {

    private static final Logger LOG = LoggerFactory.getLogger(AlgoliaServiceImpl.class);

    private SearchClient client;
    private SearchIndex index;
    private boolean enabled;

    @Activate
    protected void activate(AlgoliaConfig config) {
        this.enabled = config.enabled();
        if (this.enabled) {
            try {
                this.client = DefaultSearchClient.create(config.applicationId(), config.apiKey());
                this.index = client.initIndex(config.indexName());
                LOG.info("Algolia Service Activated for Index: {}", config.indexName());
            } catch (Exception e) {
                LOG.error("Failed to initialize Algolia Client", e);
            }
        }
    }

    @Deactivate
    protected void deactivate() throws IOException {
        if (this.client != null) {
            this.client.close();
        }
    }

    @Override
    public void indexPage(Page page) {
        if (!enabled || index == null || page == null) return;

        try {
            Map<String, Object> record = new HashMap<>();
            // objectID is required by Algolia to identify unique records
            record.put("objectID", page.getPath());
            record.put("title", page.getTitle());
            record.put("description", page.getDescription());
            record.put("path", page.getPath());

            // Add Last Modified Date
            if(page.getLastModified() != null) {
                record.put("lastModified", page.getLastModified().getTimeInMillis());
            }

            // Send to Algolia
            index.saveObject(record);
            LOG.debug("Indexed page: {}", page.getPath());

        } catch (Exception e) {
            LOG.error("Error indexing page: {}", page.getPath(), e);
        }
    }

    @Override
    public void removePage(String path) {
        if (!enabled || index == null || path == null) return;

        try {
            index.deleteObject(path);
            LOG.info("Removed page from Algolia: {}", path);
        } catch (Exception e) {
            LOG.error("Error removing page: {}", path, e);
        }
    }
}
