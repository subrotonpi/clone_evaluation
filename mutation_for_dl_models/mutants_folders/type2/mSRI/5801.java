public static void main (String [] args) throws FileNotFoundException, IOException {

    Path myPath = Paths.get ("e:\\", "1.txt");

    List < String > X1;

    X1 = Files.readAllLines (myPath, StandardCharsets.US_ASCII);

    PrintWriter out = new PrintWriter ("e:\\2.txt");

    for (int i = 0;

    i < X1.size (); i ++) {

        String [] temp = X1.get (i).split (":");

        if (temp.length > 1) {

            out.println (X1.get (i));

        }

    }

    out.close ();

}
