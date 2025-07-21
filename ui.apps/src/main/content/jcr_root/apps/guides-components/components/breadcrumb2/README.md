Breadcrumb2
====
Breadcrumb navigation component written in HTL for displaying the user's current location within the site hierarchy.

## Features
* Dynamically generates breadcrumb trail based on page hierarchy
* Supports custom root and depth
* Automatically hides pages marked as hidden from navigation

### Configuration Properties
1. `./breadcrumbRoot` - The root page for the breadcrumb trail (optional)
2. `./structureDepth` - The depth of the breadcrumb trail (optional)
3. `./hideCurrent` - If true, hides the current page from the breadcrumb

## BEM Description
```
BLOCK cmp-breadcrumb2
    ELEMENT cmp-breadcrumb2__item
    ELEMENT cmp-breadcrumb2__link
    MOD cmp-breadcrumb2__item--active
```

