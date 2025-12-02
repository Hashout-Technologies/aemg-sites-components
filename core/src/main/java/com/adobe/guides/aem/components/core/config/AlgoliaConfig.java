package com.adobe.guides.aem.components.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.AttributeType;

@ObjectClassDefinition(name = "Algolia Search Configuration", description = "Configuration for Algolia Search Integration")
public @interface AlgoliaConfig {

    @AttributeDefinition(name = "Application ID", description = "Algolia Application ID", type = AttributeType.STRING)
    String applicationId();

    @AttributeDefinition(name = "Admin API Key", description = "Algolia Admin API Key (keep secret)", type = AttributeType.PASSWORD)
    String apiKey();

    @AttributeDefinition(name = "Index Name", description = "Name of the Algolia Index", type = AttributeType.STRING)
    String indexName() default "aem_dev_index";

    @AttributeDefinition(name = "Enabled", description = "Enable or Disable Indexing", type = AttributeType.BOOLEAN)
    boolean enabled() default true;
}
