public static void main (final String [] args) {

    final Console console = System.console ();

    if (console != null) {

        final SortNames sortNames = new SortNames (console);

        sortNames.run ();

    } else {


        System.exit (1);

    }

}
