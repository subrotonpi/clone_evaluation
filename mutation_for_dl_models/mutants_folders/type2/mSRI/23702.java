public int solution (int X, int [] A) {

    int size = A.length;

    int [] check = new int [X];

    int cmp = 0;

    int X1 = - 1;

    for (int x = 0;

    x < size; x ++) {

        int temp = A [x];

        if (temp <= X) {

            if (check [temp - 1] > 0) {

                continue;

            }

            check [temp - 1] ++;

            cmp ++;

        }

        if (cmp == X) {

            X1 = x;

            break;

        }

    }

    return X1;

}
