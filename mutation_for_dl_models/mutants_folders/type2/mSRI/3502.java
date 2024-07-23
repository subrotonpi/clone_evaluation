static void shuffleArray (int [] ar) {

    Random X1 = ThreadLocalRandom.current ();

    for (int i = ar.length - 1;

    i > 0; i --) {

        int index = X1.nextInt (i + 1);

        int a = ar [index];

        ar [index] = ar [i];

        ar [i] = a;

    }

}
