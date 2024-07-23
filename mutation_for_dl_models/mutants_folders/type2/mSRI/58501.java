public static void main (String [] args) {

    int first, second;

    Scanner X1 = new Scanner (System.in);

    System.out.println ("Enter first integer: ");

    int numOne;

    numOne = X1.nextInt ();

    System.out.println ("You have keyed in " + numOne);

    System.out.println ("Enter second integer: ");

    int numTwo;

    numTwo = X1.nextInt ();

    System.out.println ("You have keyed in " + numTwo);

    Random generator = new Random ();

    int num = (int) (Math.random () * numTwo);

    System.out.println ("Random number: " + ((num > numOne) ? num : numOne + num));

}
