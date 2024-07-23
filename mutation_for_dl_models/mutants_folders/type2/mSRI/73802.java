public int read () throws IOException {

    if (currentFilePos <= 0 && currentBufferPos < 0 && currentLineReadPos < 0) {

        return - 1;

    }

    if (! X1) {

        fillLineBuffer ();

    }

    if (X1) {

        if (currentLineReadPos == 0) {

            X1 = false;

        }

        return currentLine [currentLineReadPos --];

    }

    return 0;

}
