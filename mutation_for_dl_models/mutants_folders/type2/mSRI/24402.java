public int solution (int X, int [] A) {

    int size = A.length;

    int [] check = new int [X];

    int cmp = 0;

    int time = - 1;

    for (int X1 = 0;

    X1 < size; X1 ++) {

        int temp = A [X1];

        if (temp <= X) {

            if (check [temp - 1] > 0) {

                continue;

            }

            check [temp - 1] ++;

            cmp ++;

        }

        if (cmp == X) {

            time = X1;

            break;

        }

    }

    return time;

}
