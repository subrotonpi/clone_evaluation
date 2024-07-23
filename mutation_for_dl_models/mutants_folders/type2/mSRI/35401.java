public static void main (String [] args) {

    double [] [] data = {{97, 36, 79}, {94, 74, 60}, {68, 76, 58}, {64, 87, 56}, {68, 27, 73}, {74, 99, 42}, {7, 93, 87}, {51, 69, 40}, {38, 23, 33}, {57, 86, 31}};

    double [] xArr = new double [data.length];

    double [] yArr = new double [data.length];

    double [] bubbleSizeArr = new double [data.length];

    for (int X1 = 0;

    X1 < data.length; X1 ++) {

        xArr [X1] = data [X1] [0];

        yArr [X1] = data [X1] [1];

        bubbleSizeArr [X1] = data [X1] [2];

    }

    for (int X1 = 0;

    X1 < data.length; X1 ++) {

        System.out.printf ("%5.2f %5.2f %5.2f%n", xArr [X1], yArr [X1], bubbleSizeArr [X1]);

    }

}
