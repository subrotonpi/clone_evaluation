public static void main (String [] args) {

    LinkedList < String > list = new LinkedList < > ();

    while (! StdIn.isEmpty ()) {

        String input = StdIn.readString ();

        if (input.equals ("print")) {


            continue;

        }

        if (input.charAt (0) == ('+')) {

            list.add (input.substring (1));

            continue;

        }

        if (input.charAt (0) == ('-')) {

            list.remove (input.substring (1));

            continue;

        }

        break;

    }

}
