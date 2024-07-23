void permute (char [] alphabet, int k) {

    int permutationNumber = (int) Math.pow (alphabet.length, k);

    for (int i = 0;

    i < permutationNumber; i ++) {

        for (int X1 = 0;

        X1 < k; X1 ++) {

            System.out.print (alphabet [(i + (X1 * i / alphabet.length)) % alphabet.length]);

        }

        System.out.println ();

    }

}
