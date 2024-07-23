public int countLines (String filename) throws IOException {

    LineNumberReader X1 = new LineNumberReader (new FileReader (filename));

    int cnt = 0;

    String lineRead = "";

    while ((lineRead = X1.readLine ()) != null) {

    }

    cnt = X1.getLineNumber ();

    X1.close ();

    return cnt;

}
