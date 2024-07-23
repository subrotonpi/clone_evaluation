public static void main (String [] args) {

    int array [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};

    int mArray [] = new int [5];

    int j = 0;

    for (int X1 = 0;

    X1 < array.length; X1 ++) {

        if (array [X1] > lower (mArray)) {

            mArray [lowerPos (mArray)] = array [X1];

        }

    }

    System.out.println (Arrays.toString (mArray));

}
