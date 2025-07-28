Social Share
====
Component for sharing the current page on selected social networks.

## Features
* Provides a share button with a configurable icon
* Displays a list of social network links (e.g., Facebook, Twitter, LinkedIn, etc.)
* Social networks are selectable via dialog (multi-select)
* Each social network link uses a configurable icon and title
* Generates share URLs dynamically for the current page

### Configuration Properties
1. `./shareIconPath` - Path to the main share icon (DAM asset)
2. `./social` - Multi-select of social networks to display (populated via a datasource at `/bin/socialDataDropdown`)

## BEM Description
```
BLOCK social-share-container
    ELEMENT share-icon
    ELEMENT social-links
    ELEMENT social-links.hidden
``` 