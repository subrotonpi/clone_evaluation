public void shuffle (X1) {

    int [] temp = new int [TOTALCARDS];

    for (int i = 0;

    i < temp.length; i ++) {

        temp [i] = i;

    }

    for (int i = 0;

    i < temp.length; i ++) {

        deck.push (protoDeck [temp [i]]);

    }

}
