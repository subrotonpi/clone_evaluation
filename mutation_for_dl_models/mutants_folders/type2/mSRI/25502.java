public int solution (int X, int [] A) {

    int X1 = A.length;

    int [] check = new int [X];

    int cmp = 0;

    int time = - 1;

    for (int x = 0;

    x < X1; x ++) {

        int temp = A [x];

        if (temp <= X) {

            if (check [temp - 1] > 0) {

                continue;

            }

            check [temp - 1] ++;

            cmp ++;

        }

        if (cmp == X) {

            time = x;

            break;

        }

    }

    return time;

}
