Prev-Next Topic
====
Component for navigating to the previous and next topics in a sequence.

## Features
* Displays links to previous and next topics
* Configurable icons and labels for navigation
* Responsive layout

### Configuration Properties
1. `./previousIcon` - Path to the previous topic icon (DAM asset)
2. `./previousLabel` - Label for the previous topic link
3. `./nextIcon` - Path to the next topic icon (DAM asset)
4. `./nextLabel` - Label for the next topic link

## BEM Description
```
BLOCK gu-pre-next-wrapper
    ELEMENT gu-pre-topic_container-wrapper
    ELEMENT gu-pre-topic_container
    ELEMENT gu-pre-next-topic_arrow-container
    ELEMENT gu-pre-topic_container-img
    ELEMENT gu-pre-next-topic_text-container
    ELEMENT gu-pre-next-topic_text
    ELEMENT gu-pre-next-topic_link
    ELEMENT gu-next-topic_container-wrapper
    ELEMENT gu-next-topic_container
    ELEMENT gu-next-topic_container-img
```
