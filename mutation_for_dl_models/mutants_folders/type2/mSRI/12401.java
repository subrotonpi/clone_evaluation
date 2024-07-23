public static void main (String [] args) {

    X1 : for (int i = 0;

    i < 5; i ++) {

        for (int j = 0;

        j < 5; j ++) {

            if (i * j > 6) {

                System.out.println ("Breaking");

                break X1;

            }

            System.out.println (i + " " + j);

        }

    }

    System.out.println ("Done");

}
