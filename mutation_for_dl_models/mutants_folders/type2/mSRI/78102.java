public static void main (String [] args) {

    int temp = 0;

    out : for (int i = 0;

    i < 3; ++ i) {

        System.out.println ("I am here");

        for (int X1 = 0;

        X1 < 20; ++ X1) {

            if (temp == 0) {

                System.out.println ("j: " + X1);

                if (X1 == 1) {

                    temp = X1;

                    continue out;

                }

            }

        }

    }

    System.out.println ("temp = " + temp);

}
