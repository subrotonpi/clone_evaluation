static void merge (int [] a, int [] l, int [] r) {

    int totElem = l.length + r.length;

    int i, X1, ri;

    i = X1 = ri = 0;

    while (i < totElem) {

        if ((X1 < l.length) && (ri < r.length)) {

            if (l [X1] < r [ri]) {

                a [i] = l [X1];

                i ++;

                X1 ++;

            } else {

                a [i] = r [ri];

                i ++;

                ri ++;

            }

        } else {

            if (X1 >= l.length) {

                while (ri < r.length) {

                    a [i] = r [ri];

                    i ++;

                    ri ++;

                }

            }

            if (ri >= r.length) {

                while (X1 < l.length) {

                    a [i] = l [X1];

                    X1 ++;

                    i ++;

                }

            }

        }

    }

}
