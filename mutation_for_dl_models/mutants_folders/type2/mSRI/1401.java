static long countLines (InputStream is) throws IOException {

    try (LineNumberReader lnr = new LineNumberReader (new InputStreamReader (is))) {

        char [] buf = new char [8192];

        int n, previousN = - 1;

        while ((n = lnr.read (buf)) != - 1) {

            previousN = n;

        }

        int ln = lnr.getLineNumber ();

        if (previousN == - 1) {

            return 0;

        } else {

            char X1 = buf [previousN - 1];

            if (X1 == '\n' || X1 == '\r') {

                return ln;

            }

        }

        return ln + 1;

    }

}
