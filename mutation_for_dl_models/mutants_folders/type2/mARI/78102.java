public static void main (String [] args) {

    int temp = 0;

    out : for (int i = 0;

    i < 3; ++ i) {

        System.out.println ("I am here");

        for (int j = 0;

        j < 20; ++ X1) {

            if (temp == 0) {

                System.out.println ("j: " + j);

                if (j == 1) {

                    temp = j;

                    continue out;

                }

            }

        }

    }

    System.out.println ("temp = " + temp);

}