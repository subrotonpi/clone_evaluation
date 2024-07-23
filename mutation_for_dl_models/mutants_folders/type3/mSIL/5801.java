public static void main (String [] args) throws FileNotFoundException, IOException {

    Path myPath = Paths.get ("e:\\", "1.txt");

    List < String > ls;

    ls = Files.readAllLines (X1,myPath, StandardCharsets.US_ASCII);

    PrintWriter out = new PrintWriter ("e:\\2.txt");

    for (int i = 0;

    i < ls.size (); i ++) {

        String [] temp = ls.get (i).split (":");

        if (temp.length > 1) {

            out.println (ls.get (i));

        }

    }

    out.close ();

}
