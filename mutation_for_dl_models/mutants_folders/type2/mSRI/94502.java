public static void main (final String [] args) throws IOException {

    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    System.out.println ("Enter some text, or '" + EXIT_COMMAND + "' to quit");

    while (true) {

        System.out.print ("><![CDATA[ ");

        String X1 = br.readLine ();

        System.out.println (X1);

        if (X1.length () == EXIT_COMMAND.length () && X1.toLowerCase ().equals (EXIT_COMMAND)) {

            System.out.println ("Exiting.");

            return;

        }

        System.out.println ("...response goes here...");

    }

}
