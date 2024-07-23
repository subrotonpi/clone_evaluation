public static int solution (int X, int [] X1) {

    int [] counter = new int [X + 1];

    int ans = - 1;

    int x = 0;

    for (int i = 0;

    i < X1.length; i ++) {

        if (counter [X1 [i]] == 0) {

            counter [X1 [i]] = X1 [i];

            x += 1;

            if (x == X) {

                return i;

            }

        }

    }

    return ans;

}
