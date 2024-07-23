static int findMIN (int [] A, int X1) {

    int x = A [X1];

    int position = X1;

    while (X1 < A.length) {

        if (x > A [X1]) {

            x = A [X1];

            position = X1;

        }

        X1 ++;

    }

    return position;

}
