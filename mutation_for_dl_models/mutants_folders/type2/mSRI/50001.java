public static void main (String [] args) {

    Scanner s = new Scanner (System.in);

    int n = Integer.parseInt (s.nextLine ());

    int [] [] a = new int [n] [n];

    for (int i = 0;

    i < n; i ++) {

        String str = s.nextLine ();

        String [] tempArray = str.split (" ");

        for (int j = 0;

        j < n; j ++) {

            a [i] [j] = Integer.parseInt (tempArray [j]);

        }

    }

    int x = 0;

    int y = 0;

    int sum = 0;

    for (int i = 0;

    i < n; i ++) {

        x += a [i] [i];

    }

    for (int X1 = 0;

    X1 < n; X1 ++) {

        int k = a.length - X1 - 1;

        y += a [X1] [a.length - X1 - 1];

        k += - 1;

    }

    sum = x - y;

    System.out.println (Math.abs (sum));

}
