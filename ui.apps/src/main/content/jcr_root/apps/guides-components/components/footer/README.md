Footer
====
Footer component for displaying site-wide footer content, links, and social/contact/company/legal information.

## Features
* Displays site logo (light and dark variants) with configurable link
* Renders multiple link sections: legal, pages, company, contact, and social
* Configurable section titles for each link group
* Supports icons for social and contact links
* Responsive layout for different screen sizes

### Configuration Properties
1. `./lightLogo` - Path to the light logo image (DAM asset)
2. `./darkLogo` - Path to the dark logo image (DAM asset)
3. `./logoLink` - Link for the logo (typically homepage)
4. `./legalList` - Multifield for legal links:
    - `./ctaLabel` - Label for the legal link
    - `./ctaLink` - Link for the legal link
5. `./pageLinksTitle` - Title for the pages section
6. `./pagesList` - Multifield for pages links (with nested pageList):
    - `./pageList` - Multifield for each page link:
        - `./ctaLabel` - Label for the page link
        - `./ctaLink` - Link for the page
7. `./companyLinksTitle` - Title for the company section
8. `./companyList` - Multifield for company links:
    - `./ctaLabel` - Label for the company link
    - `./ctaLink` - Link for the company page
9. `./contactLinksTitle` - Title for the contact section
10. `./contactList` - Multifield for contact links:
    - `./ctaIcon` - Icon for the contact
    - `./ctaLabel` - Label for the contact
    - `./ctaLink` - Link for the contact
11. `./socialLinksTitle` - Title for the social section
12. `./socialList` - Multifield for social links:
    - `./ctaIcon` - Icon for the social link
    - `./ctaLink` - Link for the social profile

## BEM Description
```
BLOCK gu-footer_wrapper
    ELEMENT gu-footer_left-container
    ELEMENT gu-footer_logo-container
    ELEMENT gu-footer_logo
    ELEMENT gu-footer_legal-container
    ELEMENT gu-footer_legal-link
    ELEMENT gu-footer_right-container
    ELEMENT gu-footer_topic-heading
    ELEMENT gu-footer_pages-container
    ELEMENT gu-footer_page-link_container
    ELEMENT gu-footer_page-link
    ELEMENT gu-footer_company-container
    ELEMENT gu-footer_company-wrapper
    ELEMENT gu-footer_company-link
    ELEMENT gu-footer_end-container
    ELEMENT gu-footer_contact-wrapper
    ELEMENT gu-footer_contact-container
    ELEMENT gu-footer_contact-icon
    ELEMENT gu-footer_contact-link
    ELEMENT gu-footer_contact-text
    ELEMENT gu-footer_social-container
    ELEMENT gu-footer_social-link
    ELEMENT gu-footer_social-icon
```
