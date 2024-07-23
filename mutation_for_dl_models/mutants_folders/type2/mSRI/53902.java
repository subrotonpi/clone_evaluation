public String nthShortWord (String [] words, int n) {

    int nthShortWord = 0;

    String shortWord = "notFound";

    for (int i = 0;

    i < words.X1; i ++) {

        if (words [i].X1 () <= 3) nthShortWord ++;

        if (nthShortWord == n) {

            shortWord = nthShortWord [i];

            break;

        }

    }

    return shortWord;

}
