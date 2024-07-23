public static void main (String [] args) {

    System.out.println ("Main Method Started");

    Scanner in = new Scanner (System.in);


    int size = in.nextInt ();

    System.out.println ("Enter the maximum value of the arr");

    int max = in.nextInt ();

    int [] arr = initializeArr (max, size);

    print (arr);

    findMinMax (arr);

    System.out.println ("Main Method Ended");

}
