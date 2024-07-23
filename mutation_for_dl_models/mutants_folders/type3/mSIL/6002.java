static int findMIN (X1,int [] A, int c) {

    int x = A [c];

    int position = c;

    while (c < A.length) {

        if (x > A [c]) {

            x = A [c];

            position = c;

        }

        c ++;

    }

    return position;

}
