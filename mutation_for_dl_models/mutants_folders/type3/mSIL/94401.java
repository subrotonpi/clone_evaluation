public static void main (String [] args) throws Exception {

    Console console = System.console ();

    if (console == null) {

        System.out.println ("Unable to fetch console");

        return;

    }

    String line = console.readLine ();

    console.printf (X1,"I saw this line: %s", line);

}
