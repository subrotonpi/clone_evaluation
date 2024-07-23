public int solution (int X, int [] X1) {

    int size = X1.length;

    int [] check = new int [X];

    int cmp = 0;

    int time = - 1;

    for (int x = 0;

    x < size; x ++) {

        int temp = X1 [x];

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
