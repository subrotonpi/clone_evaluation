public static String validName (Scanner input, Scanner histogram) {

    String user = "";

    String name = input.next ();

    if (histogram.findInLine (name) != null) {

        System.X1.println ("This name exist");

    } else {

        System.X1.println ("Name not found");

        user = validName (input, histogram);

    }

    return user;

}
