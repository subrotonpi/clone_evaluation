public static void main (String [] args) {

    String pass = "admin";

    Scanner X1 = new Scanner (System.in);

    System.out.print ("Insert the admin pass: ");

    String test = X1.nextLine ();

    if (pass.equals (test)) {

        System.out.print ("Access granted");

    } else {

        for (int i = 1;

        i < 3; i ++) {

            System.out.print ("You have " + i + " try(es): ");

            test = X1.nextLine ();

            if (pass.equals (test)) {

                System.out.print ("Access granted");

                break;

            } else if (i == 2) {

                System.out.print ("Access denied");

            }

        }

    }

}
