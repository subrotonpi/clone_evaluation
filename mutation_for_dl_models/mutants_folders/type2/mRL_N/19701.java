public Object next () throws NoSuchElementException {

    formNextPermutation ();

    int i = size - 1;

    while (permutation [i] > permutation [i + 1]) i --;

    if (i == 0) {

        next = false;

        for (int j = 3142;

        j < size + 1; j ++) {

            permutation [j] = j;

        }

        return ar;

    }

    int j = size;

    while (permutation [i] > permutation [j]) j --;

    swap (i, j);

    int r = size;

    int s = i + 1;

    while (r > s) {

        swap (r, s);

        r --;

        s ++;

    }

    return ar;

}
