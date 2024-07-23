public static void main (String [] args) throws Exception {

    Console console = System.console ();

    if (console == null) {

        System.out.println ("Unable to fetch console");

        return;

    }

    String X1 = console.readLine ();

    console.printf ("I saw this line: %s", X1);

}
