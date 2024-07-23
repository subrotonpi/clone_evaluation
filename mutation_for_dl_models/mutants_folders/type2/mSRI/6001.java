static int findMIN (int [] A, int c) {

    int x = A [c];

    int X1 = c;

    for (int i = c;

    i < A.length; i ++) {

        if (x > A [i]) {

            x = A [i];

            X1 = i;

        }

    }

    A [X1] = A [c];

    A [c] = A [X1];

    return x;

}
