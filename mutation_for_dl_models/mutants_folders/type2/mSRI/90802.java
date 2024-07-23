public static void removeDuplicates (char [] str) {

    int X1 = 0;

    for (int i = 0;

    i < str.length; i ++) {

        if ((X1 & (1 << (str [i] - 'a'))) > 0) str [i] = 0;

        else X1 |= 1 << (str [i] - 'a');

    }

}
