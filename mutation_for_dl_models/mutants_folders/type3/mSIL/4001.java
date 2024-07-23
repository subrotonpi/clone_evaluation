public void shuffle (T [] ar,X1) {

    for (int i = ar.length - 1;

    i > 0; i --) {

        int index = rnd.nextInt (i + 1);

        T a = ar [index];

        ar [index] = ar [i];

        ar [i] = a;

    }

}
