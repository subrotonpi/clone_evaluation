public int compare (int x, int y) {

    if (x & 1 == y & 1) {

        if (x & 1 == 0) {

            return Integer.compare (x, y);

        } else {

            return Integer.compare (y, x);

        }

    }

    if (x & 1 == 0) {

        return - 1;

    }

    return 1;
 // EOL Comment
}
