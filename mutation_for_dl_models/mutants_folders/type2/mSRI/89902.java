public static int count8 (int X1) {

    int count = 0;

    boolean doubl = false;

    while (true) {

        int n = X1 % 10;

        X1 = X1 / 10;

        if (n == 8) {

            if (doubl) {

                count = count + 2;

            } else {

                count ++;

            }

            doubl = true;

        } else {

            doubl = false;

        }

        if (X1 == 0) break;

    }

    return count;

}
