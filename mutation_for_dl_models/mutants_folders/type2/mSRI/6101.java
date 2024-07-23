static int findMIN (int [] A, int c) {

    int first = c;

    int X1 = c;

    int x = A [c];

    while (c < A.length) {

        if (x > A [c]) {

            x = A [c];

            X1 = c;

        }

        c ++;

    }

    int tmp = A [first];

    A [first] = A [X1];

    A [X1] = tmp;

    return x;

}
