public void shuffle (T [] ar) {

    for (int X1 = ar.length - 1;

    X1 > 0; X1 --) {

        int index = rnd.nextInt (X1 + 1);

        T a = ar [index];

        ar [index] = ar [X1];

        ar [X1] = a;

    }

}
