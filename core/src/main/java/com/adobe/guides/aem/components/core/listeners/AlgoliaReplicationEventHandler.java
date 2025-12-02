package com.adobe.guides.aem.components.core.listeners;

import com.adobe.guides.aem.components.core.services.AlgoliaService;
import com.adobe.guides.aem.components.core.services.ResourceResolverService;
import com.day.cq.replication.ReplicationAction;
import com.day.cq.replication.ReplicationActionType;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;

@Component(
        service = EventHandler.class,
        property = {
                EventConstants.EVENT_TOPIC + "=" + ReplicationAction.EVENT_TOPIC
        }
)
public class AlgoliaReplicationEventHandler implements EventHandler {

    private static final Logger LOG = LoggerFactory.getLogger(AlgoliaReplicationEventHandler.class);

    @Reference
    private AlgoliaService algoliaService;

    @Reference
    private ResourceResolverService resourceResolverService;

    @Override
    public void handleEvent(Event event) {
        ReplicationAction action = ReplicationAction.fromEvent(event);
        if (action == null) return;

        LOG.debug("Processing Replication Event: {} for path: {}", action.getType(), action.getPath());

        if (ReplicationActionType.ACTIVATE.equals(action.getType())) {
            // Content published -> Add/Update Index
            try (ResourceResolver resolver = resourceResolverService.getServiceResourceResolver()) {
                if (resolver != null) {
                    PageManager pageManager = resolver.adaptTo(PageManager.class);
                    Page page = pageManager.getPage(action.getPath());
                    if (page != null) {
                        algoliaService.indexPage(page);
                    }
                }
            } catch (Exception e) {
                LOG.error("Error handling activation for Algolia", e);
            }

        } else if (ReplicationActionType.DEACTIVATE.equals(action.getType()) ||
                ReplicationActionType.DELETE.equals(action.getType())) {
            // Content unpublished/deleted -> Remove from Index
            algoliaService.removePage(action.getPath());
        }
    }

}
