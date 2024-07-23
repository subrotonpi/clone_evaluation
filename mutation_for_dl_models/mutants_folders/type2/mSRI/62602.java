public static void main (String args []) throws Exception {

    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    System.out.println ("enter size of the array");

    int l = Integer.parseInt (br.readLine ());

    int [] a = new int [l];

    for (int X1 = 0;

    X1 < l; X1 ++) {

        System.out.println ("enter a element");

        int el = Integer.parseInt (br.readLine ());

        a [X1] = el;

    }

    for (int X1 = 0;

    X1 < l; X1 ++) {

        for (int j = 0;

        j < l - 1; j ++) {

            if (a [j] > a [j + 1]) {

                int temp = a [j];

                a [j] = a [j + 1];

                a [j + 1] = temp;

            }

        }

    }

    int b = 0;

    a [b] = a [0];

    for (int X1 = 1;

    X1 < l; X1 ++) {

        if (a [b] != a [X1]) {

            b ++;

            a [b] = a [X1];

        }

    }

    for (int X1 = 0;

    X1 <= b; X1 ++) {

        System.out.println (a [X1]);

    }

}
