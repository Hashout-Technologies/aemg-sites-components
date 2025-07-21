Custom Container
====
A flexible container component for grouping and styling child components.

## Features
* Allows grouping of multiple child components
* Supports two-column and three-column layouts
* Responsive design for different screen sizes

### Configuration Properties
1. `./sectionId` - Custom section ID for the container (optional)
2. `./colLayout` - Column layout type (required):
    - `twoColumn` - Two column layout
    - `threeColumn` - Three column layout

## BEM Description
```
BLOCK gu-custom-container
    ELEMENT col-3grid
    ELEMENT col-3grid--left
    ELEMENT col-3grid--right
    ELEMENT col-6grid
    ELEMENT col-9grid
    ELEMENT col-9grid-container
    ELEMENT col-9grid-components
    ELEMENT outer-container
```
