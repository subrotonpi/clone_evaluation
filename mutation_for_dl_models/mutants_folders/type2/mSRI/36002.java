public static void main (String [] args) {

    System.out.println ("Main Method Started");

    Scanner X1 = new Scanner (System.X1);

    System.out.println ("Enter the size of the arr");

    int size = X1.nextInt ();

    System.out.println ("Enter the maximum value of the arr");

    int max = X1.nextInt ();

    int [] arr = initializeArr (max, size);

    print (arr);

    findMinMax (arr);

    System.out.println ("Main Method Ended");

}
