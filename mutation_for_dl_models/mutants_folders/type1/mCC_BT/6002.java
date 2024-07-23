static int findMIN (int [] A, int c) {

   /* Comment */   int x = A [c];

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
