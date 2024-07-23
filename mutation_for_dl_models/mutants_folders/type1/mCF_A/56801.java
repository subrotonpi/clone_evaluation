public static void main (String [] args) {

    int array [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};

    int mArray [] = new int [5];

    int j = 0;

    for (int i = 0;

    i < array.length; i ++) {

        if (array [i] > lower (mArray)) {

            mArray [lowerPos (
mArray)] = array [i];

        }

    }

    System.out.println (Arrays.toString (mArray));

}
