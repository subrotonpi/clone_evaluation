public static void main (String [] args) throws Exception {

    Console X1 = System.X1 ();

    if (X1 == null) {

        System.out.println ("Unable to fetch console");

        return;

    }

    String line = X1.readLine ();

    X1.printf ("I saw this line: %s", line);

}
