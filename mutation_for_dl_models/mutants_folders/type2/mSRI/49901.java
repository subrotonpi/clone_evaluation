public static void main (String [] args) {

    Scanner s = new Scanner (System.in);

    int n = Integer.parseInt (s.nextLine ());

    int [] [] a = new int [n] [n];

    for (int X1 = 0;

    X1 < n; X1 ++) {

        String str = s.nextLine ();

        String [] tempArray = str.split (" ");

        for (int j = 0;

        j < n; j ++) {

            a [X1] [j] = Integer.parseInt (tempArray [j]);

        }

    }

    int x = 0;

    int y = 0;

    int sum = 0;

    for (int X1 = 0;

    X1 < n; X1 ++) {

        x += a [X1] [X1];

    }

    for (int p = 0;

    p < n; p ++) {

        int k = a.length - p - 1;

        y += a [p] [a.length - p - 1];

        k += - 1;

    }

    sum = x - y;

    System.out.println (Math.abs (sum));

}
