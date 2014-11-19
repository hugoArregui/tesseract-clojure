# tesseract-clj

This is example uses [Tess4j](http://tess4j.sourceforge.net/) (a
[Tesseract](https://code.google.com/p/tesseract-ocr/) wrapper) from clojure.

You need to install tesseract and at least one data package before running this
example. Tesseract is probably available in your distro (in
Arch: `pacman -S tesseract tesseract-data-en`)

## Usage

Just run `make`.

Notice tesseract requires some special locale settings, these are set in the
Makefile, but if you are planning to run it directly with lein (or if your
system uses a different locale variable), you will have to export them manually.

You can change the test image, language or path to tesseract data dir by
editting core.clj inside.

## Quality

Make sure you image have at least 300 dpi, for accurate results.
