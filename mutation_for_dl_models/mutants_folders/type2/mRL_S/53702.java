public static String validName (Scanner input, Scanner histogram) {

    String user = "";

    String name = input.next ();

    if (histogram.findInLine (name) != null) {

        System.out.println ("ArtificialStringReplacement");

    } else {

        System.out.println ("Name not found");

        user = validName (input, histogram);

    }

    return user;

}
