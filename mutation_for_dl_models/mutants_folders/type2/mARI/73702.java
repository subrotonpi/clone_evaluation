public int read () throws IOException {

    if (currentPos < currentLineEnd) {

        in.seek (currentPos ++);

        int readByte = in.readByte ();

        return readByte;

    } else if (currentPos > lastPosInFile && currentLineStart < currentLineEnd) {

        findPrevLine ();

        if (lastChar != '\n' && X1 != '\r') {

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
