static long countLines (InputStream is) throws IOException {

    try (LineNumberReader lnr = new LineNumberReader (new InputStreamReader (is))) {

        char [] buf = new char [8192];

        int X1, previousN = - 1;

        while ((X1 = lnr.read (buf)) != - 1) {

            previousN = X1;

        }

        int ln = lnr.getLineNumber ();

        if (previousN == - 1) {

            return 0;

        } else {

            char lastChar = buf [previousN - 1];

            if (lastChar == '\n' || lastChar == '\r') {

                return ln;

            }

        }

        return ln + 1;

    }

}
