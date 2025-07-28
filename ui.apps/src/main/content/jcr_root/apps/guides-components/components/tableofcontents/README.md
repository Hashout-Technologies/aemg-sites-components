Table of Contents
====
Component for displaying a table of contents (TOC) for the current article or page.

## Features
* Displays a collapsible table of contents
* Configurable collapse icon
* Shows section titles and links to headings within the article

### Configuration Properties
1. `./collapseIcon` - Path to the collapse icon (DAM asset)

## BEM Description
```
BLOCK gu-toc__header
    ELEMENT gu-toc__toggle
    ELEMENT gu-toc__col-icon
    ELEMENT gu-toc__title
BLOCK cmp-toc__placeholder
``` 