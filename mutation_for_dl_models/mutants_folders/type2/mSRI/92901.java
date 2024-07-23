public int X1 (int x, int y) {

    if (x & 1 == y & 1) {

        if (x & 1 == 0) {

            return Integer.X1 (x, y);

        } else {

            return Integer.X1 (y, x);

        }

    }

    if (x & 1 == 0) {

        return - 1;

    }

    return 1;

}
