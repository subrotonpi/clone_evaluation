public static void main (String [] args) {

    int first, second;

    Scanner myScanner = new Scanner (System.in);

    System.out.println ("Enter first integer: ");

    int numOne;

    numOne = myScanner.nextInt ();

    System.out.println ("You have keyed in " + numOne);

    System.out.println ("Enter second integer: ");

    int X1;

    X1 = myScanner.nextInt ();

    System.out.println ("You have keyed in " + X1);

    Random generator = new Random ();

    int num = (int) (Math.random () * X1);

    System.out.println ("Random number: " + ((num > numOne) ? num : numOne + num));

}
