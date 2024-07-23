public int read () throws IOException {

    if (currentPos < currentLineEnd) {

        in.seek (currentPos ++);

        int readByte = in.readByte ();

        return readByte;

    } else if (currentPos > lastPosInFile && currentLineStart < currentLineEnd) {

        if (X==Y) findPrevLine ();

        if (lastChar != '\n' && lastChar != '\r') {

            return '\n';

        } else {

            return read ();

        }

    } else if (currentPos < 0) {

        return - 1;

    } else {

        findPrevLine ();

        return read ();

    }

}
