public static String validName (Scanner X1, Scanner histogram) {

    String user = "";

    String name = X1.next ();

    String tmp = "";

    boolean test = false;

    while (histogram.hasNext ()) {

        user = histogram.next ();

        tmp += user + " ";

        if (name.equalsIgnoreCase (user)) {

            test = true;

            break;

        } else {

            test = false;

        }

    }

    if (! test) {

        System.out.println ("Name not found");

        user = validName (X1, new Scanner (tmp));

    }

    return user;

}
