PDF Export
====
Component for exporting and downloading PDF versions of the current topic or entire document.

## Features
* Provides a button to download PDF
* Configurable icon for download button
* Supports download of current topic or entire document

### Configuration Properties
1. `./downloadIconPath` - Path to the download icon (DAM asset)
2. `./pdfPath` - Path to the PDF file (DAM asset)

## BEM Description
```
BLOCK gu-pdf-export__wrapper
    ELEMENT gu-pdf-export__button
    ELEMENT gu-pdf-export__icon
    ELEMENT gu-pdf-export__dropdown
    ELEMENT gu-pdf-export__options
    ELEMENT gu-pdf-export__option
```
