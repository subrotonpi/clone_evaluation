public static void main (String [] args) {

    int arr [];

    Scanner scan = new Scanner (System.in);

    for (int X1 = 0;

    X1 < 5; X1 ++) {

        System.out.print ("Enter number " + (X1 + 1) + ": ");

        arr [X1] = scan.nextInt ();

    }

    for (int X1 = 0;

    X1 < 5; X1 ++) System.out.println ("Number " + (X1 + 1) + ": " + arr [X1]);

}
