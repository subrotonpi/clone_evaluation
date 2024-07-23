public static void main (String [] args) {

    int X1 [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};

    int mArray [] = new int [5];

    int j = 0;

    for (int i = 0;

    i < X1.length; i ++) {

        if (X1 [i] > lower (mArray)) {

            mArray [lowerPos (mArray)] = X1 [i];

        }

    }

    System.out.println (Arrays.toString (mArray));

}
