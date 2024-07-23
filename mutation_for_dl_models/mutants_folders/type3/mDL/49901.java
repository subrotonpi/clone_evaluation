public static void main (String [] args) {

    Scanner s = new Scanner (System.in);

    int n = Integer.parseInt (s.nextLine ());

    int [] [] a = new int [n] [n];

    for (int i = 0;

    i < n; i ++) {


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

    for (int p = 0;

    p < n; p ++) {

        int k = a.length - p - 1;

        y += a [p] [a.length - p - 1];

        k += - 1;

    }

    sum = x - y;

    System.out.println (Math.abs (sum));

}
