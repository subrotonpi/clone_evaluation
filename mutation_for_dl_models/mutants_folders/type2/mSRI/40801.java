static void rotate (int [] array, int k) {

    int X1 = array.length;

    if (X1 <= 1) return;

    k = k % X1;

    if (k == 0) return;

    for (int i = 0, start = 0, from = 0, to = - 1, move = array [0];

    i < X1; ++ i, from = to) {

        to = (from + k) % X1;

        int temp = array [to];

        array [to] = move;

        move = to == start ? array [to = ++ start] : temp;

    }

}
