public int solution (int X, int [] A) {

    int size = A.length;

    int [] X1 = new int [X];

    int cmp = 0;

    int time = - 1;

    for (int x = 0;

    x < size; x ++) {

        int temp = A [x];

        if (temp <= X) {

            if (X1 [temp - 1] > 0) {

                continue;

            }

            X1 [temp - 1] ++;

            cmp ++;

        }

        if (cmp == X) {

            time = x;

            break;

        }

    }

    return time;

}
