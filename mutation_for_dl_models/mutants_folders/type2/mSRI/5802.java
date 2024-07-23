public static void main (String [] args) throws FileNotFoundException, IOException {

    FileInputStream fin = new FileInputStream ("line.srt");

    BufferedReader reader = new BufferedReader (new InputStreamReader (fin));

    PrintWriter out = new PrintWriter ("newline.srt");

    int i = 0;

    String X1 = reader.readLine ();

    while (X1 != null) {

        if (! X1.trim ().equals ("")) {

            out.println (X1);

        }

        X1 = reader.readLine ();

    }

    out.close ();

}
