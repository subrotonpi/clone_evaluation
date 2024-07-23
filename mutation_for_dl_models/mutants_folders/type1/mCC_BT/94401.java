public static void main (String [] args) throws Exception {

    Console console = System.console ();

    if (console == null) {

        System.out.println ("Unable to fetch console");

        return;

    /* Comment */  }

    String line = console.readLine ();

    console.printf ("I saw this line: %s", line);

}
