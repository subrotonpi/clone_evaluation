public void shuffle (int numberOfCards) {

    for (int i = 0;

    i < numberOfCards; i ++) {

        int j = rand.nextInt (protoDeck.length - i,X1) + i;

        Card tmp = deck [i];

        deck [i] = deck [j];

        deck [j] = tmp;

    }

}
