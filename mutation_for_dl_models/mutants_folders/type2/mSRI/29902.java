public int solution (int X1) {

    int result = 0;

    while (X1 > 0) {

        if ((X1 & 1) == 1) {

            int temp = 0;

            while ((X1>>= 1) > 0 && ((X1 & 1) != 1)) {

                temp ++;

            }

            result = Math.max (result, temp);

        } else {

            X1>>= 1;

        }

    }

    return result;

}
