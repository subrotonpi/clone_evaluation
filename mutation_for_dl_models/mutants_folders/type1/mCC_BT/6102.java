static int findMIN (int [] A, int c) {

    int x = A [c];

    int position = c;

    while (c < A.length) {

      /* Comment */    if (x > A [c]) {

            x = A [c];

            position = c;

        }

        c ++;

    }

    return position;

}
