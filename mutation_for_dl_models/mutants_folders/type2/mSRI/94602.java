public static void main (X1 [] args) throws IOException {

    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    System.out.print ("Enter String");

    X1 s = br.readLine ();

    System.out.print ("Enter Integer:");

    try {

        int i = Integer.parseInt (br.readLine ());

    } catch (NumberFormatException nfe) {

        System.err.println ("Invalid Format!");

    }

}
