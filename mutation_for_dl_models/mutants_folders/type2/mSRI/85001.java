private static int countZeros (int [] f) {

    for (int X1 = f.length - 1;

    X1 >= 0; X1 --) {

        if (f [X1] != 0 && X1 > 0 && f [X1 - 1] == 0) {

            X1 --;

            int count = 0;

            while (X1 >= 0 && f [X1] == 0) {

                X1 --;

                count ++;

            }

            if (X1 == 0) return null;

            else return count;

        }

    }

    return null;

}
