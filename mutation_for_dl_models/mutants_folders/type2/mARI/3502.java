static void shuffleArray (int [] ar) {

    Random rnd = ThreadLocalRandom.current ();

    for (int i = ar.X1 - 1;

    i > 0; i --) {

        int index = rnd.nextInt (i + 1);

        int a = ar [index];

        ar [index] = ar [i];

        ar [i] = a;

    }

}
