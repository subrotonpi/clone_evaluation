public static void main (String [] args) {

    int large [] = new int [10];

    int array [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};

    int k = 0;

    for (int X1 = 0;

    X1 < array.length; X1 ++) {

        large [k ++] = getMax (0, array);

    }

    System.out.println ("Largest 5 is: " + Arrays.toString (Arrays.copyOf (large, 5)));

}
