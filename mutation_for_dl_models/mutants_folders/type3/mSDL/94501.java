public static void main (String [] args) throws Exception {

    Console console = System.console ();

    if (console == null) {

        System.out.println ();

        return;

    }

    String line = console.readLine ();

    console.printf ("I saw this line: %s", line);

}
