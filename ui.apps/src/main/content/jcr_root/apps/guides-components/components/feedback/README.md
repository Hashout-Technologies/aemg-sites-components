Feedback
====
Component for collecting user feedback on pages using like/dislike buttons.

## Features
* Allows users to submit feedback with like (thumbs up) or dislike (thumbs down) buttons
* Configurable icons for like and dislike buttons
* Configurable feedback title text
* Modal-style feedback form with open/close controls

### Configuration Properties
1. `./likeIcon` - Path to the like (thumbs up) icon (DAM asset)
2. `./dislikeIcon` - Path to the dislike (thumbs down) icon (DAM asset)
3. `./title` - Title text for the feedback form (optional)

## BEM Description
```
BLOCK gu-feedback
    ELEMENT gu-feedback__cta
    ELEMENT gu-feedback__container
    ELEMENT gu-feedback__close-btn
    ELEMENT gu-feedback__close-icon
    ELEMENT gu-feedback__wrapper
    ELEMENT gu-feedback__text
    ELEMENT gu-feedback__button-container
    ELEMENT gu-feedback__button
    ELEMENT gu-feedback__like-icon
    ELEMENT gu-feedback__dislike-icon
    ELEMENT gu-feedback__button-text
```
