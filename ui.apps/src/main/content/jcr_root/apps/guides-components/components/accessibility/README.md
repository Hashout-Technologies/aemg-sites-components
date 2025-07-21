Accessibility
====
Accessibility helper component written in HTL to provide user controls for improved web accessibility.

## Features
* Provides an accessibility menu with:
  * Increase text size
  * Increase text spacing
  * High contrast mode
  * Low contrast mode
  * Reset all accessibility settings
* Configurable icons for each menu item
* Accessible button and menu structure with ARIA attributes

### Configuration Properties
1. `./accessibilityIcon` - Path to the main accessibility icon (DAM asset)
2. `./textSizeIcon` - Path to the text size icon (DAM asset)
3. `./textSpaceIcon` - Path to the text space icon (DAM asset)
4. `./highContrastIcon` - Path to the high contrast icon (DAM asset)
5. `./lowContrastIcon` - Path to the low contrast icon (DAM asset)
6. `./resetIcon` - Path to the reset icon (DAM asset)

## BEM Description
```
BLOCK gu-accessibility_wrapper
    ELEMENT gu-accessibility_icon-container
    ELEMENT gu-accessibility_icon
    ELEMENT gu-accessibility_menu
    ELEMENT text-size
    ELEMENT text-space
    ELEMENT high-contrast
    ELEMENT low-contrast
    ELEMENT reset-all
```
