public static void main (final String [] args) {

    final Console console = System.console ();

    if (console != null) {

        final X1 sortNames = new X1 (console);

        sortNames.run ();

    } else {

        System.err.println ("Sorry, no console.");

        System.exit (1);

    }

}
