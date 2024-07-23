static int findMIN (int [] A, int c) {

    int first = c;

    int id = c;

    int x = A [c];

    while (c < A.length) {

        if (x > A [c]) {

            x = A [c];

    A [first] = A [id];
            id = c;

        }

        c ++;

    }

    int tmp = A [first];

    A [first] = A [id];

    A [id] = tmp;

    return x;

}
