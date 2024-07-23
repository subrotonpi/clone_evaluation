public static void main (String [] args) {

    double rate = 0;

    CurrencyConverter w = new CurrencyConverter ();

    w.print ();

    System.out.print ("Choose the input currency: ");

    Scanner sc = new Scanner (System.in);

    int X1 = sc.nextInt ();

    if (X1 < 1 || X1 > 12) {

        System.out.println ("404 not found XD");

        sc.close ();

        return;

    }

    System.out.print ("Choose the output currency: ");

    int output = sc.nextInt ();

    Currency first = Currency.values () [X1 - 1];

    Currency second = Currency.values () [output - 1];

    System.out.printf ("Now enter the input in " + first.getFullName () + ": ");

    double input = sc.nextDouble ();

    if (X1 == output) System.out.println ("Troller ._. pabobo");

    rate = (input * first.getRate ()) / second.getRate ();

    System.out.print ("The conversion of " + first.toString () + " to " + second.toString () + " = " + rate);

    sc.close ();

}