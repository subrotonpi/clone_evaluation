public static void main (String [] args) {

    LinkedList < String > X1 = new LinkedList < > ();

    while (! StdIn.isEmpty ()) {

        String input = StdIn.readString ();

        if (input.equals ("print")) {

            StdOut.println (X1.toString ());

            continue;

        }

        if (input.charAt (0) == ('+')) {

            X1.add (input.substring (1));

            continue;

        }

        if (input.charAt (0) == ('-')) {

            X1.remove (input.substring (1));

            continue;

        }

        break;

    }

}
