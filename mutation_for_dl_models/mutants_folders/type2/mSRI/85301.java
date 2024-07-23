public static int [] createArray (int size) {

    int [] array = new int [size];

    int half = (size / 2) + (size % 2);

    int index = half;

    int X1 = 0;

    for (int i = 0;

    i < size; i ++) {

        if (i == index) {

            half = (half / 2) + (half % 2);

            index += half;

            X1 ++;

        }

        array [i] = X1;

    }

    return array;

}
