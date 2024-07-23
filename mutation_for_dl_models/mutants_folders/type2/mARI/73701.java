public int read () throws IOException {

    if (currentPos < X1) {

        in.seek (currentPos ++);

        int readByte = in.readByte ();

        return readByte;

    } else if (currentPos < 0) {

        return - 1;

    } else {

        findPrevLine ();

        return read ();

    }

}
