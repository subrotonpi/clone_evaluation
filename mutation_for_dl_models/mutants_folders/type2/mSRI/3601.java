private static void shuffleArray (int [] X1) {

    int index;

    Random random = new Random ();

    for (int i = X1.length - 1;

    i > 0; i --) {

        index = random.nextInt (i + 1);

        if (index != i) {

            X1 [index] ^= X1 [i];

            X1 [i] ^= X1 [index];

            X1 [index] ^= X1 [i];

        }

    }

}
