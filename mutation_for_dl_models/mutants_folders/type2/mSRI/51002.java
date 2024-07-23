public void shuffle (int numberOfCards) {

    for (int X1 = 0;

    X1 < numberOfCards; X1 ++) {

        int j = rand.nextInt (protoDeck.length - X1) + X1;

        Card tmp = deck [X1];

        deck [X1] = deck [j];

        deck [j] = tmp;

    }

}
