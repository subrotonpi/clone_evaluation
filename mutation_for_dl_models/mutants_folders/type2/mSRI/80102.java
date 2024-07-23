static String shuffle (String X1) {

    if (X1.length () <= 1) return X1;

    int split = X1.length () / 2;

    String temp1 = shuffle (X1.substring (0, split));

    String temp2 = shuffle (X1.substring (split));

    if (Math.random () > 0.5) return temp1 + temp2;

    else return temp2 + temp1;

}
