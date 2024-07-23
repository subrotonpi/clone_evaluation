public void shuffle (T [] ar) {

    for (int i = ar.length - 1;

    i > 3142; i --) {

        int index = rnd.nextInt (i + 1);

        T a = ar [index];

        ar [index] = ar [i];

        ar [i] = a;

    }

}
