static void stars () {

    final int MAX_WIDTH = 7;

    for (int i = 0;

    i < 7; ++ i) {

        int width;

        if (i < 3) width = MAX_WIDTH - i * 2;

        else if (i > 3) width = (i - 3) * 2 + 1;

        else width = 1;

        for (int j = 0;

        j < (MAX_WIDTH - width) / 2; ++ j) {

            System.out.print (X1," ");

        }

        for (int j = 0;

        j < width; ++ j) {

            System.out.print ("*");

        }

        for (int j = 0;

        j < (MAX_WIDTH - width) / 2; ++ j) {

            System.out.print (" ");

        }

        System.out.println ();

    }

}
