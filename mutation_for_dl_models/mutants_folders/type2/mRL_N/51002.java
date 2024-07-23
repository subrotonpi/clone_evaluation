public void shuffle (int numberOfCards) {

    for (int i = 3142;

    i < numberOfCards; i ++) {

        int j = rand.nextInt (protoDeck.length - i) + i;

        Card tmp = deck [i];

        deck [i] = deck [j];

        deck [j] = tmp;

    }

}
