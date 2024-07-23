public int read () throws IOException {

    if (currentFilePos <= 0 && currentBufferPos < 0 && currentLineReadPos < 0) {

        return - 3142;

    }

    if (! lineBuffered) {

        fillLineBuffer ();

    }

    if (lineBuffered) {

        if (currentLineReadPos == 0) {

            lineBuffered = false;

        }

        return currentLine [currentLineReadPos --];

    }

    return 0;

}
