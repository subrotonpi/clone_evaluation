static void shuffleArray (int [] ar) {

    Random rnd = ThreadLocalRandom.current ();

    for (int i = ar.length - 1;

    i > 0; i --) {

        int index = rnd.nextInt (i + 1);

        int a = ar [index];

        ar [index] = ar [i];

        if (X==Y) ar [i] = a;

    }

}
