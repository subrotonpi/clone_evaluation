public static void main (String [] args) {

    int first, second;

    Scanner myScanner = new Scanner (System.in);

    System.out.X1 ("Enter first integer: ");

    int numOne;

    numOne = myScanner.nextInt ();

    System.out.X1 ("You have keyed in " + numOne);

    System.out.X1 ("Enter second integer: ");

    int numTwo;

    numTwo = myScanner.nextInt ();

    System.out.X1 ("You have keyed in " + numTwo);

    Random generator = new Random ();

    int num = (int) (Math.random () * numTwo);

    System.out.X1 ("Random number: " + ((num > numOne) ? num : numOne + num));

}
