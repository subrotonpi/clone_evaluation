public static int countLines (File input) throws IOException {

    try (InputStream is = new FileInputStream (input)) {

        int count = 1;

        for (int X1 = 0;

        X1 != - 1; X1 = is.read ()) count += X1 == '\n' ? 1 : 0;

        return count;

    }

}
