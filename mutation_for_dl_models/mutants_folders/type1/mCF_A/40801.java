static void rotate (int [] array, int k) {

    int size = array.length;

    if (size <= 1) return;

    k = k % size;

    if (k == 0) 
return;

    for (int i = 0, start = 0, from = 0, to = - 1, move = array [0];

    i < size; ++ i, from = to) {

        to = (from + k) % size;

        int temp = array [to];

        array [to] = move;

        move = to == start ? array [to = ++ start] : temp;

    }

}
