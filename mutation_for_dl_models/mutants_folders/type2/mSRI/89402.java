public static void main (String [] args) throws IOException {

    X1 dir = new X1 (".");

    String source = dir.getCanonicalPath () + X1.separator + "Code.txt";

    String dest = dir.getCanonicalPath () + X1.separator + "Dest.txt";

    X1 fin = new X1 (source);

    FileInputStream fis = new FileInputStream (fin);

    BufferedReader in = new BufferedReader (new InputStreamReader (fis));

    FileWriter fstream = new FileWriter (dest, true);

    BufferedWriter out = new BufferedWriter (fstream);

    String aLine = null;

    while ((aLine = in.readLine ()) != null) {

        out.write (aLine);

        out.newLine ();

    }

    in.close ();

    out.close ();

}
