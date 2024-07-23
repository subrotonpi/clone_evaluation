public E [] next () {

    if (! has_next) throw new NoSuchElementException ();

    for (int i = 0;

    i < ind.length; i ++) {

        output [i] = arr [ind [i]];

    }

    has_next = false;

    for (int X1 = ind.length - 1;

    X1 > 0; X1 --) {

        if (ind [X1 - 1] < ind [X1]) {

            int s = ind.length - 1;

            while (ind [X1 - 1] >= ind [s]) s --;

            swap (ind, X1 - 1, s);

            for (int i = X1, j = ind.length - 1;

            i < j; i ++, j --) {

                swap (ind, i, j);

            }

            has_next = true;

            break;

        }

    }

    return output;

}
