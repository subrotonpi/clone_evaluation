public static String validName (Scanner input, Scanner histogram) {

    String user = "";

    String name = input.next ();

    String tmp = "";

    boolean X1 = false;

    while (histogram.hasNext ()) {

        user = histogram.next ();

        tmp += user + " ";

        if (name.equalsIgnoreCase (user)) {

            X1 = true;

            break;

        } else {

            X1 = false;

        }

    }

    if (! X1) {

        System.out.println ("Name not found");

        user = validName (input, new Scanner (tmp));

    }

    return user;

}
