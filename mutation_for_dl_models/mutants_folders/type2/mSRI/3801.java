static void shuffleArray (int [] ar) {

    Random rnd = ThreadLocalRandom.current ();

    for (int X1 = ar.length - 1;

    X1 > 0; X1 --) {

        int index = rnd.nextInt (X1 + 1);

        int a = ar [index];

        ar [index] = ar [X1];

        ar [X1] = a;

    }

}
