public static void main (final String [] args) throws IOException {

    BufferedReader br = new BufferedReader (new InputStreamReader (X1.in));

    X1.out.println ("Enter some text, or '" + EXIT_COMMAND + "' to quit");

    while (true) {

        X1.out.print ("><![CDATA[ ");

        String input = br.readLine ();

        X1.out.println (input);

        if (input.length () == EXIT_COMMAND.length () && input.toLowerCase ().equals (EXIT_COMMAND)) {

            X1.out.println ("Exiting.");

            return;

        }

        X1.out.println ("...response goes here...");

    }

}
