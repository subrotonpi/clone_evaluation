public int solution (int N) {

    int result = 0;

    while (N > 0) {

        if ((N & 1) == 1) {

            int X1 = 0;

            while ((N>>= 1) > 0 && ((N & 1) != 1)) {

                X1 ++;

            }

            result = Math.max (result, X1);

        } else {

            N>>= 1;

        }

    }

    return result;

}
