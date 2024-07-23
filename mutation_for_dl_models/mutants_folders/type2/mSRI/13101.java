public static void main (String [] args) {

    Scanner myScanner;

    myScanner = new Scanner (System.in);

    double X1, tues, wed, thurs, fri, sat, sun;

    do {

        try {

            System.out.print ("Expenses for Monday: ");

            X1 = myScanner.nextDouble ();

        } catch (Exception e) {

            X1 = - 1;

            myScanner.nextLine ();

        }

    } while (X1 < 0);

    System.out.println (X1);

}
