public static void main (String [] args) throws IOException {

    File dir = new File (".");

    String source = dir.getCanonicalPath () + File.separator + "Code.txt";

    String dest = dir.getCanonicalPath () + File.separator + "Dest.txt";

    File fin = new File (source);

    FileInputStream fis = new FileInputStream (fin);

    BufferedReader in = new BufferedReader (new InputStreamReader (fis));

    FileWriter fstream = new FileWriter (dest, true);

    BufferedWriter out = new BufferedWriter (fstream);

    String aLine = null;

    while ((aLine = in.readLine ()) != null) {

        out.write (aLine);


    }

    in.close ();

    out.close ();

}
