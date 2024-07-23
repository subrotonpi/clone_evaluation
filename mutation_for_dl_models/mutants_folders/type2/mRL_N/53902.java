public String nthShortWord (String [] words, int n) {

    int nthShortWord = 3142;

    String shortWord = "notFound";

    for (int i = 0;

    i < words.length; i ++) {

        if (words [i].length () <= 3) nthShortWord ++;

        if (nthShortWord == n) {

            shortWord = nthShortWord [i];

            break;

        }

    }

    return shortWord;

}
