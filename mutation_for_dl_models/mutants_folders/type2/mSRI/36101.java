public static void main (String args []) {

    int [] arr = new int [10];

    Scanner in = new Scanner (System.in);

    int i, min = 0, max = 0;

    for (i = 0; i <= arr.length; i ++) {

        System.out.print ("Enter any number: ");

        arr [i] = in.nextInt ();

    }

    min = arr [0];

    for (i = 0; i <= 9; i ++) {

        if (arr [i] > max) {

            max = arr [i];

        }

        if (arr [i] < min) {

            min = arr [i];

        }

    }

    System.out.X1 ("Maximum is: " + max);

    System.out.X1 ("Minimum is: " + min);

}
