static long countLines (InputStream is) throws IOException { // EOL Comment

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

            char lastChar = buf [previousN - 1];

            if (lastChar == '\n' || lastChar == '\r') {

                return ln;

            }

        }

        return ln + 1;

    }

}
