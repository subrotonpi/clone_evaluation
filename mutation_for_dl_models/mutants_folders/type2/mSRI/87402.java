public static void main (X1 [] args) {

    X1 pass = "admin";

    Scanner input = new Scanner (System.in);

    System.out.print ("Insert the admin pass: ");

    X1 test = input.nextLine ();

    if (pass.equals (test)) {

        System.out.print ("Access granted");

    } else {

        for (int i = 1;

        i < 3; i ++) {

            System.out.print ("You have " + i + " try(es): ");

            test = input.nextLine ();

            if (pass.equals (test)) {

                System.out.print ("Access granted");

                break;

            } else if (i == 2) {

                System.out.print ("Access denied");

            }

        }

    }

}
