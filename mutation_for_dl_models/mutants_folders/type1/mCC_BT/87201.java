public static void main (String [] args) {

    String pass = "admin";

    Scanner input = new Scanner (System.in);

    for (int i = 0;

    i < 3; i ++) {

        System.out /* Comment */ .print ("Insert the admin pass: ");

        String test = input.nextLine ();

        if (pass.equals (test)) {

            System.out.print ("Access granted");

            i = 3;

        } else {

            System.out.println ("Incorrect password, you have " + (2 - i) + " attempts remaining");

        }

    }

}
