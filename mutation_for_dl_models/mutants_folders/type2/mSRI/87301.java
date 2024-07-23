public static void main (String [] args) {

    String pass = "admin";

    Scanner input = new Scanner (System.in);

    for (int i = 0;

    i < 3; i ++) {

        System.out.print ("Insert the admin pass: ");

        String X1 = input.nextLine ();

        if (pass.equals (X1)) {

            System.out.print ("Access granted");

            i = 3;

        } else {

            System.out.println ("Incorrect password, you have " + (2 - i) + " attempts remaining");

        }

    }

}
