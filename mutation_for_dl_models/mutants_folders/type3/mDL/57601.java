public static void stars (int size) {

    for (int i = 0;

    i < size * size; i ++) {

        int y = i / size, x = i % size;


        if (x == size - 1) System.out.println ();

    }

}
