public int solution (int N) {

    int X1 = 0;

    while (N > 0) {

        if ((N & 1) == 1) {

            int temp = 0;

            while ((N>>= 1) > 0 && ((N & 1) != 1)) {

                temp ++;

            }

            X1 = Math.max (X1, temp);

        } else {

            N>>= 1;

        }

    }

    return X1;

}
