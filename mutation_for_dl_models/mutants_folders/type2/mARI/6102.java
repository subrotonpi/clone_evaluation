static int findMIN (int [] A, int c) {

    int x = A [c];

    int position = c;

    while (c < A.length) {

        if (x > A [c]) {

            X1 = A [c];

            position = c;

        }

        c ++;

    }

    return position;

}
