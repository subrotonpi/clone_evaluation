public int solution (int X, int [] A) {

    int size = A.length;

    int [] check = new int [X];

    int cmp = 0;

    int time = - 1;

    for (int x = 0;

    x < size; x ++) {

        int X1 = A [x];

        if (X1 <= X) {

            if (check [X1 - 1] > 0) {

                continue;

            }

            check [X1 - 1] ++;

            cmp ++;

        }

        if (cmp == X) {

            time = x;

            break;

        }

    }

    return time;

}
