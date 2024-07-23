static void shuffleArray (int [] ar) {


    for (int i = ar.length - 1;

    i > 0; i --) {

        int index = rnd.nextInt (i + 1);

        int a = ar [index];

        ar [index] = ar [i];

        ar [i] = a;

    }

}
