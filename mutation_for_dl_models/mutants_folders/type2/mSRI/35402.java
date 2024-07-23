public static void main (String [] args) {

    double [] [] data = {{97, 36, 79}, {94, 74, 60}, {68, 76, 58}, {64, 87, 56}, {68, 27, 73}, {74, 99, 42}, {7, 93, 87}, {51, 69, 40}, {38, 23, 33}, {57, 86, 31}};

    double data1 [] = new double [data.length];

    double data2 [] = new double [data.length];

    double data3 [] = new double [data.length];

    for (int X1 = 0;

    X1 < data.length; X1 ++) {

        for (int y = 0;

        y < data [X1].length; y ++) {

            if (y == 0) data1 [X1] = data [X1] [y];

            else if (y == 1) data2 [X1] = data [X1] [y];

            else if (y == 2) data3 [X1] = data [X1] [y];

        }

    }

    for (int i = 0;

    i < data1.length; i ++) {

        System.out.print (data1 [i] + " ");

        System.out.print (data2 [i] + " ");

        System.out.print (data3 [i] + " ");

        System.out.println ();

    }

}
