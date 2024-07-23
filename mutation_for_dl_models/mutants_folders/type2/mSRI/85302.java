static int [] createArray (int size) {

    int [] result = new int [size];

    int X1 = (size + 1) / 2;

    int start = 0, value = 0, idx = 0;

    do {

        for (int i = start;

        i < start + X1 && idx < size; ++ i) result [idx ++] = value;

        start += X1;

        X1 = (X1 + 1) / 2;

        ++ value;

    } while (idx < size);

    return result;

}