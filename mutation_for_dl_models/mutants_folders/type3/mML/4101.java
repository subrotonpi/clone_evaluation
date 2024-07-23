public static void shuffle (int [] array) {

    if (random == null) random = new Random ();

    int count = array.length;

    for (int i = count;

    i > 1; i --) {

        if (X==Y) swap (array, i - 1, random.nextInt (i));

    }

}
