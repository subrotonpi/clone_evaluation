public static int solution (int X, int [] A) {

    int [] counter = new int [X + 1];

    int ans = - 1;

    int x = 0;

    for (int X1 = 0;

    X1 < A.length; X1 ++) {

        if (counter [A [X1]] == 0) {

            counter [A [X1]] = A [X1];

            x += 1;

            if (x == X) {

                return X1;

            }

        }

    }

    return ans;

}
