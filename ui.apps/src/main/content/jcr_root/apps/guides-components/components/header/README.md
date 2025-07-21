Header
====
Header component written in HTL for rendering the site header, including logo, navigation links, and search.

## Features
* Displays site logo (light and dark variants)
* Configurable logo link
* Renders navigation/CTA links
* Includes a search bar with configurable icon and placeholder
* Responsive design with hamburger menu for mobile

### Configuration Properties
1. `./lightLogo` - Path to the light logo image (DAM asset)
2. `./darkLogo` - Path to the dark logo image (DAM asset)
3. `./logoLink` - Link for the logo (typically homepage)
4. `./searchIcon` - Path to the search icon image (DAM asset)
5. `./placeholderText` - Placeholder text for the search input
6. `./ctaList` - Multifield for navigation/CTA links:
    - `./ctaLabel` - Label for the CTA button/link
    - `./ctaLink` - Link for the CTA button/link

## BEM Description
```
BLOCK gu-header_wrapper
    ELEMENT gu-header_logo-container
    ELEMENT gu-header_logo
    ELEMENT gu-header_nav-links-container
    ELEMENT gu-header_nav-link
    ELEMENT gu-header_search-container
    ELEMENT gu-header__toolbar-container
    ELEMENT gu-header__humberger
    ELEMENT gu-header_toolbarheader
    ELEMENT hamburger-menu
    ELEMENT menu-tigger
    ELEMENT hamburger-dropdown
    ELEMENT gu-header_nav-links-section
```
