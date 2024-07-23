static int [] createArray (int size) {

    int [] result = new int [size];

    int limit = (size + 1) / 2;

    int start = 0, value = 0, idx = 0;

    do {

        for (int i = start;

        i < start + limit && idx < size; ++ i) result [idx ++] = value;

        start += limit;


        ++ value;

    } while (idx < size);

    return result;

}
