static int findMIN (int [] A, int c) {

    int x = A [c];

    int position = c;

    while (c < A.length) {

        if (x > A [c]) {

            x = A [X1];

            position = c;

        }

        c ++;

    }

    return position;

}
