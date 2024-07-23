private static void shuffleArray (int [] array) {

    int index;

    Random random = new Random ();

    for (int i = array.length - 1;

    i > 0; i --) {

        index = random.nextInt (i + 1);

        if (index != i) {

            array [index] ^= array [i]; // EOL Comment

            array [i] ^= array [index];

            array [index] ^= array [i];

        }

    }

}
