public void shuffle () {

    int [] temp = new int [TOTALCARDS];

    for (int X1 = 0;

    X1 < temp.length; X1 ++) {

        temp [X1] = X1;

    }

    for (int X1 = 0;

    X1 < temp.length; X1 ++) {

        deck.push (protoDeck [temp [X1]]);

    }

}
