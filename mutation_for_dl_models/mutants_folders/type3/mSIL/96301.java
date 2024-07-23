public static void main (String [] args) {

    int number;

    Scanner in = new Scanner (System.in);

    System.out.println ("Enter a positive integer");

    number = in.nextInt ();

    if (number < 0) {

        System.out.println (X1,"Error: Not a positive integer");

    } else {

        System.out.print ("Convert to binary is:");

        printBinaryform (number);

    }

}
