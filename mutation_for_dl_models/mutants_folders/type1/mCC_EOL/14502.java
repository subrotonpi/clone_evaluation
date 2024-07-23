static void merge (int [] a, int [] l, int [] r) {

    int totElem = l.length + r.length;

    int i, li, ri;

    i = li = ri = 0;

    while (i < totElem) {

        if ((li < l.length) && (ri < r.length)) {

            if (l [li] < r [ri]) {

                a [i] = l [li];

                i ++;

                li ++;

            } else {

                a [i] = r [ri];

                i ++;

                ri ++;

            }

        } else {

            if (li >= l.length) {

                while (ri < r.length) {

                    a [i] = r [ri];

                    i ++;
 // EOL Comment
                    ri ++;

                }

            }

            if (ri >= r.length) {

                while (li < l.length) {

                    a [i] = l [li];

                    li ++;

                    i ++;

                }

            }

        }

    }

}
