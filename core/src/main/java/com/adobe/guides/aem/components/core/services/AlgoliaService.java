package com.adobe.guides.aem.components.core.services;

import com.day.cq.wcm.api.Page;

public interface AlgoliaService {
    /**
     * Index a specific page to Algolia.
     * @param page The AEM Page object.
     */
    void indexPage(Page page);

    /**
     * Remove a page from Algolia index.
     * @param path The path of the page to remove.
     */
    void removePage(String path);
}
