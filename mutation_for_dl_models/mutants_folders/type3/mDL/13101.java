public static void main (String [] args) {

    Scanner myScanner;

    myScanner = new Scanner (System.in);

    double mon, tues, wed, thurs, fri, sat, sun;

    do {

        try {


            mon = myScanner.nextDouble ();

        } catch (Exception e) {

            mon = - 1;

            myScanner.nextLine ();

        }

    } while (mon < 0);

    System.out.println (mon);

}
