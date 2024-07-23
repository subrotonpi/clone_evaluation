public static void main (String [] args) {

    char [] values = {'a', 'b', 'c', 'd'};

    int n = values.length;

    int r = 2;

    int X1 = 0, j = 0;

    for (X1 = 0; X1 < n; X1 ++) {

        for (j = 0; j < n; j ++) {

            System.out.println (values [j] + " " + values [X1]);

        }

    }

}
