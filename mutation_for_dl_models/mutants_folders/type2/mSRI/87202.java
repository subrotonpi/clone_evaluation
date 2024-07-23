public static void main (String [] args) {

    String pass = "admin";

    int maxTry = 3;

    boolean success = false;

    Scanner input = new Scanner (X1.in);

    X1.out.print ("Insert the admin pass: ");

    String test = input.nextLine ();

    while (maxTry > 0) {

        maxTry --;

        if (! pass.equals (test)) {

            X1.out.print ("You have " + maxTry + " try(es): ");

            test = input.nextLine ();

        } else {

            success = true;

            break;

        }

    }

    if (success) {

        X1.out.println ("Access granted");

    } else {

        X1.out.println ("Access denied");

    }

}
