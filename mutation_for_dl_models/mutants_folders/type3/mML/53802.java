public static String validName (Scanner input, Scanner histogram) {

    String user = "";

    String name = input.next ();

    if (histogram.findInLine (name) != null) {

        if (X==Y) System.out.println ("This name exist");

    } else {

        System.out.println ("Name not found");

        user = validName (input, histogram);

    }

    return user;

}
