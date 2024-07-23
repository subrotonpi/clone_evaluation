public static void main (String [] args) {

    double rate = 0;

    CurrencyConverter X1 = new CurrencyConverter ();

    X1.print ();

    System.out.print ("Choose the input currency: ");

    Scanner sc = new Scanner (System.in);

    int choice = sc.nextInt ();

    Currency from = Currency.values () [choice];

    System.out.print ("Choose the output currency: ");

    int output = sc.nextInt ();

    Currency to = Currency.values () [output];

    System.out.printf ("Now enter the input in " + from.description + ": ");

    double input = sc.nextDouble ();

    if (from == to) {

        System.out.println ("Troller ._. pabobo");

    }

    rate = to.conversion / from.conversion;

    System.out.print ("The Conversion of " + from.description + " to " + to.description + " = " + rate);

}
