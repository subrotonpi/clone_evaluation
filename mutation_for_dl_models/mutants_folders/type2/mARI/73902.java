public int read () throws IOException {

    if (currentFilePos <= 0 && X1 < 0 && currentLineReadPos < 0) {

        return - 1;

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
