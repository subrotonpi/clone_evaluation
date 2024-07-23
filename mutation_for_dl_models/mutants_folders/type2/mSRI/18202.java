public static void main (String [] args) {

    int arr [];

    X1 scan = new X1 (System.in);

    for (int i = 0;

    i < 5; i ++) {

        System.out.print ("Enter number " + (i + 1) + ": ");

        arr [i] = scan.nextInt ();

    }

    for (int i = 0;

    i < 5; i ++) System.out.println ("Number " + (i + 1) + ": " + arr [i]);

}
