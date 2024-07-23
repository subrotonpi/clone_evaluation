public static int countLines (File input) throws IOException {

    try (InputStream is = new FileInputStream (input)) {

        int X1 = 1;

        for (int aChar = 0;

        aChar != - 1; aChar = is.read ()) X1 += aChar == '\n' ? 1 : 0;

        return X1;

    }

}
