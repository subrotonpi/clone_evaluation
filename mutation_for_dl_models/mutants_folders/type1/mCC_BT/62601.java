public static void main (String [] args) throws Exception {

    final int [] original = new int [] {1, 1, 2, 8, 9, 8, 4, 7, 4, 9, 1};

    System.out.println (Arrays.toString (original));

    quicksort (original);

    System.out.println (Arrays.toString (original));

    final int [] unqiue = new int [original.length];

    int prev = original [0];

    unqiue [0] = prev;

    int count = 1;

    for (int i = 1;

    i < original.length; ++ i) {

        if (original [i] != prev) {

            unqiue [count ++] = original [ /* Comment */ i];

        }

        prev = original [i];

    }

    System.out.println (Arrays.toString (unqiue));

    final int [] compressed = new int [count];

    System.arraycopy (unqiue, 0, compressed, 0, count);

    System.out.println (Arrays.toString (compressed));

}
