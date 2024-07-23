public static void main (String [] args) {

    String name1;

    String name2;

    String X1;

    Scanner keyboard = new Scanner (System.in);

    System.out.print ("Please Enter First Name ");

    name1 = keyboard.nextLine ();

    System.out.print ("Please Enter Second Name ");

    name2 = keyboard.nextLine ();

    System.out.print ("Please Enter Third Name ");

    X1 = keyboard.nextLine ();

    if ((name1.compareTo (name2) < 0) && (name1.compareTo (X1) < 0)) {

        System.out.println (name1);

        if (name2.compareTo (X1) < 0) {

            System.out.println (name2);

            System.out.println (X1);

        } else {

            System.out.println (X1);

            System.out.println (name2);

        }

    } else if ((name1.compareTo (name2) > 0) && (name2.compareTo (X1) < 0)) {

        System.out.println (name2);

        if (name1.compareTo (X1) < 0) {

            System.out.println (name1);

            System.out.println (X1);

        } else {

            System.out.println (X1);

            System.out.println (name1);

        }

    } else {

        System.out.println (X1);

        if (name1.compareTo (name2) < 0) {

            System.out.println (name1);

            System.out.println (name2);

        } else {

            System.out.println (name2);

            System.out.println (name1);

        }

    }

}
