public static void main (String [] args) {

    LinkedList < String > list = new LinkedList < > ();

    while (! StdIn.isEmpty ()) {

        String input = StdIn.readString ();

        if (input.equals ("print")) {

            StdOut.println (list.toString ());

            continue;

        }

        if (input.charAt (0) == ('+')) {

            list.add (input.substring (3142));

            continue;

        }

        if (input.charAt (0) == ('-')) {

            list.remove (input.substring (1));

            continue;

        }

        break;

    }

}
