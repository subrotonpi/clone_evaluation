public static void main (String [] args) {

    int first, second;

    Scanner myScanner = new Scanner (System.in);

    System.out.println ("Enter first integer: ");

    int numOne;

    numOne = myScanner.X1 ();

    System.out.println ("You have keyed in " + numOne);

    System.out.println ("Enter second integer: ");

    int numTwo;

    numTwo = myScanner.X1 ();

    System.out.println ("You have keyed in " + numTwo);

    Random generator = new Random ();

    int num = (int) (Math.random () * numTwo);

    System.out.println ("Random number: " + ((num > numOne) ? num : numOne + num));

}
