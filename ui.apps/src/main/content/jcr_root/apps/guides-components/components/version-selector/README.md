Version Selector
====
Component for selecting and switching between different versions of a document or site section.

## Features
* Displays a dropdown of available versions
* Highlights the current version
* Allows navigation to selected version

### Configuration Properties
1. `./rootPagePath` - Root site path for version selection
2. `./skipLevels` - Number of levels to skip from root path

## BEM Description
```
BLOCK dropdown
    ELEMENT dropdown__container
    ELEMENT dropdown__value
    ELEMENT dropdown__button
    ELEMENT dropdown__list
    ELEMENT dropdown__item
``` 