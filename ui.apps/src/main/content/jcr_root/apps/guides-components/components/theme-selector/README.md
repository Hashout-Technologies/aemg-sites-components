Theme Selector
====
Component for toggling between dark and light themes.

## Features
* Provides a button to toggle between dark and light themes
* Configurable icons for dark and light theme buttons

### Configuration Properties
1. `./darkTheme` - Path to the dark theme icon (DAM asset)
2. `./lightTheme` - Path to the light theme icon (DAM asset)

## BEM Description
```
BLOCK gu-theme__wrapper
    ELEMENT gu-theme__icon-container
    ELEMENT gu-theme_icon.dark
    ELEMENT gu-theme_icon.light
``` 