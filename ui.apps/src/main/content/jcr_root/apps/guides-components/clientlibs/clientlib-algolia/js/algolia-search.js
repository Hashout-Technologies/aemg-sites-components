(function() {
    'use strict';

    document.addEventListener("DOMContentLoaded", function() {

        if (!document.getElementById('searchbox')) {
            return;
        }

        // IMPORTANT: Use your "Search-Only API Key" here, NOT the Admin Key!
        const searchClient = algoliasearch(
            'YOUR_APP_ID',
            'YOUR_SEARCH_ONLY_API_KEY'
        );

        const search = instantsearch({
            indexName: 'aem_dev_index', // Match the name in your Java config
            searchClient,
        });

        search.addWidgets([

            instantsearch.widgets.searchBox({
                container: '#searchbox',
                placeholder: 'Search for articles...',
            }),

            instantsearch.widgets.hits({
                container: '#hits',
                templates: {
                    item: `
                        <article>
                            <h4><a href="{{path}}.html">{{#helpers.highlight}}{ "attribute": "title" }{{/helpers.highlight}}</a></h4>
                            <p>{{#helpers.highlight}}{ "attribute": "description" }{{/helpers.highlight}}</p>
                        </article>
                    `,
                    empty: `<div>No results found for "<strong>{{query}}</strong>".</div>`,
                },
            }),

            // Stats (e.g., "100 results found in 5ms")
            instantsearch.widgets.stats({
                container: '#stats',
            }),

            // Pagination
            instantsearch.widgets.pagination({
                container: '#pagination',
            })
        ]);

        search.start();
    });
})();
