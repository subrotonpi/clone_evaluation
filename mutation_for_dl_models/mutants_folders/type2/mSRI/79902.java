public static void main (String [] args) {

    char [] values = {'a', 'b', 'c', 'd'};

    int n = values.length;

    int X1 = 2;

    int i [] = new int [X1];

    int rc = 0;

    for (int j = 0;

    j < Math.pow (n, X1); j ++) {

        rc = 0;

        while (rc < X1) {

            System.out.print (values [i [rc]] + " ");

            rc ++;

        }

        System.out.println ();

        rc = 0;

        while (rc < X1) {

            if (i [rc] < n - 1) {

                i [rc] ++;

                break;

            } else {

                i [rc] = 0;

            }

            rc ++;

        }

    }

}
