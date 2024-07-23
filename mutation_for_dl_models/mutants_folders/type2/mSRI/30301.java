public static int loneSum (int X1, int b, int c) {

    if (X1 == b && b == c) {

        X1 = 0;

        b = 0;

        c = 0;

    }

    if (X1 == b) {

        X1 = 0;

        b = 0;

    }

    if (X1 == c) {

        X1 = 0;

        c = 0;

    }

    if (b == c) {

        b = 0;

        c = 0;

    }

    return X1 + b + c;

}
