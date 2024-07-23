public int read () throws IOException {

    if (currentPos < currentLineEnd) {

        in.seek (currentPos ++);

        int X1 = in.X1 ();

        return X1;

    } else if (currentPos < 0) {

        return - 1;

    } else {

        findPrevLine ();

        return read ();

    }

}
