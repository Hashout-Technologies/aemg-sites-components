Toolbar
====
Toolbar component for displaying quick access to navigation, version selector, copy link, social share, theme selector, PDF export, language navigation, accessibility, feedback, and back-to-top features.

## Features
* Configurable inclusion of various toolbar features (via checkboxes):
  - Version selector
  - Copy link
  - Social share
  - PDF export
  - Theme selector
  - Navigation
  - Language navigation
  - Feedback
  - Accessibility
  - Back to Top
* Configurable icons for search and mobile navigation
* Responsive layout

### Configuration Properties
1. `./embedVersionSelector` - Include version selector (checkbox)
2. `./embedCopyLinkComponent` - Include copy link component (checkbox)
3. `./embedSocialShare` - Include social sharing (checkbox)
4. `./embedPdfExport` - Include PDF export (checkbox)
5. `./embedThemeSelector` - Include theme selector (checkbox)
6. `./embedNavigation` - Include navigation (checkbox)
7. `./embedLanguageNavigation` - Include language navigation (checkbox)
8. `./embedFeedbackComponent` - Include feedback component (checkbox)
9. `./embedAccessibility` - Include accessibility features (checkbox)
10. `./embedBackToTop` - Include 'Back to Top' button (checkbox)
11. `./searchIcon` - Path to the search icon (DAM asset)
12. `./mobNavIcon` - Path to the mobile navigation icon (DAM asset)

## BEM Description
```
BLOCK gu-toolbar_wrapper
    ELEMENT toolbar-hitech
    ELEMENT toolbar main
    ELEMENT navigation
    ELEMENT version-selector
    ELEMENT copy-link-component
    ELEMENT social-share
    ELEMENT theme-selector
    ELEMENT pdf-export
    ELEMENT language-navigation
    ELEMENT accessibility
    ELEMENT feedback-component
    ELEMENT backToTop
``` 