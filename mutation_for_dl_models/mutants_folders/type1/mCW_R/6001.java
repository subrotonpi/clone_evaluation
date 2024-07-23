static int findMIN (int [] A, int c) {

    int x = A [c];

    int min_index = c;

    for (int i = c;

    i < A.length; i ++) {

        if (x > A [i]) {

            x = A [i];

            min_index = i;

        }

    }

    A [min_index]= A [c];

    A [c] = A [min_index];

    return x;

}
