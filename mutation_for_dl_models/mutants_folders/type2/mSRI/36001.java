public static void main (String args []) {

    int [] arr = new int [10];

    Scanner in = new Scanner (System.in);

    int X1, min = 0, max = 0;

    for (X1 = 0; X1 <= arr.length; X1 ++) {

        System.out.print ("Enter any number: ");

        arr [X1] = in.nextInt ();

    }

    min = arr [0];

    for (X1 = 0; X1 <= 9; X1 ++) {

        if (arr [X1] > max) {

            max = arr [X1];

        }

        if (arr [X1] < min) {

            min = arr [X1];

        }

    }

    System.out.println ("Maximum is: " + max);

    System.out.println ("Minimum is: " + min);

}
