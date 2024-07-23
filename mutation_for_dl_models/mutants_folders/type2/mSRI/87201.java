public static void main (String [] args) {

    String pass = "admin";

    Scanner input = new Scanner (X1.in);

    for (int i = 0;

    i < 3; i ++) {

        X1.out.print ("Insert the admin pass: ");

        String test = input.nextLine ();

        if (pass.equals (test)) {

            X1.out.print ("Access granted");

            i = 3;

        } else {

            X1.out.println ("Incorrect password, you have " + (2 - i) + " attempts remaining");

        }

    }

}
