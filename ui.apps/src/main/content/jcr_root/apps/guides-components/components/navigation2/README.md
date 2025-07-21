Navigation 2
====
Navigation component written in HTL for rendering a filterable navigation tree.

## Features
* Displays a navigation tree with filter input
* Configurable icons for search, collapse, and arrows
* Accessible with ARIA roles and labels

### Configuration Properties
1. `./filterSearchIcon` - Path to the filter search icon (DAM asset)
2. `./collapseIcon` - Path to the collapse icon (DAM asset)
3. `./arrowIcon` - Path to the arrow icon (DAM asset)

## BEM Description
```
BLOCK cmp-navigation-filter__wrapper
    ELEMENT cmp-navigation-filter-container
    ELEMENT cmp-navigation-filter__section
    ELEMENT cmp-navigation-filter__search-icon
    ELEMENT cmp-navigation-filter__closeicon
    ELEMENT cmp-navigation__col-icon
BLOCK cmp-navigation
```
