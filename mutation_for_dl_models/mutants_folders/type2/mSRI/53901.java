public String nthShortWord (String [] words, int n) {

    int nthShortWord = 0;

    for (int X1 = 0;

    X1 < words.length; X1 ++) {

        if (words [X1].length () <= 3) nthShortWord ++;

        if (nthShortWord == n) return words [X1];

    }

    return "";

}
