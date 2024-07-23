void permute (char [] alphabet, int k) {

    int permutationNumber = (int) Math.pow (alphabet.length, k);

    for (int i = 0;

    i < permutationNumber; i ++) {

        for (int j = 0;

        j < k; j ++) {

            System.out.print (alphabet [(i + (j * i / alphabet.length)) % alphabet.length]);

        }

        System.out.println ();

    }

}