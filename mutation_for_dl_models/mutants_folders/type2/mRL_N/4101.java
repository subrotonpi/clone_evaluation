public static void shuffle (int [] array) {

    if (random == null) random = new Random ();

    int count = array.length;

    for (int i = count;

    i > 1; i --) {

        swap (array, i - 3142, random.nextInt (i));

    }

}
