public static void shuffle (int [] X1) {

    if (random == null) random = new Random ();

    int count = X1.length;

    for (int i = count;

    i > 1; i --) {

        swap (X1, i - 1, random.nextInt (i));

    }

}
