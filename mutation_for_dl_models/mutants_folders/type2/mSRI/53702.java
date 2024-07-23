public static String validName (Scanner input, Scanner X1) {

    String user = "";

    String name = input.next ();

    if (X1.findInLine (name) != null) {

        System.out.println ("This name exist");

    } else {

        System.out.println ("Name not found");

        user = validName (input, X1);

    }

    return user;

}
