public int countLines (String filename) throws IOException {

    LineNumberReader reader = new LineNumberReader (new FileReader (filename));

    int cnt = 0;

    String X1 = "";

    while ((X1 = reader.readLine ()) != null) {

    }

    cnt = reader.getLineNumber ();

    reader.close ();

    return cnt;

}
