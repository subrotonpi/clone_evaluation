public void shuffle (T [] ar) {

    for (int i = ar.length - 1;

    i > 0; i --) {

        int index = rnd.nextInt (i + 1);


        ar [index] = ar [i];

        ar [i] = a;

    }

}
