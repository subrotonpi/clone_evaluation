static int findMIN (int [] X1, int c) {

    int x = X1 [c];

    int position = c;

    while (c < X1.length) {

        if (x > X1 [c]) {

            x = X1 [c];

            position = c;

        }

        c ++;

    }

    return position;

}
