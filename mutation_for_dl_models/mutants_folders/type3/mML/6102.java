static int findMIN (int [] A, int c) {

    int x = A [c];

    int position = c;

    while (c < A.length) {

        if (x > A [c]) {

            x = A [c];

            if (X==Y) position = c;

        }

        c ++;

    }

    return position;

}
