public static void main (String [] args) {

    int number;

    Scanner X1 = new Scanner (System.X1);

    System.out.println ("Enter a positive integer");

    number = X1.nextInt ();

    if (number < 0) {

        System.out.println ("Error: Not a positive integer");

    } else {

        System.out.print ("Convert to binary is:");

        printBinaryform (number);

    }

}
