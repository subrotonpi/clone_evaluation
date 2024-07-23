public static void main (String [] args) {

    double rate = 0;

    CurrencyConverter w = new CurrencyConverter ();

    w.print ();

    System.out.print ("Choose the input currency: ");

    Scanner sc = new Scanner (System.in);

    int choice = sc.nextInt ();

    Currency from = Currency.values () [choice];

    System.out /* Comment */ .print ("Choose the output currency: ");

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
