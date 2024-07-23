public static void removeDuplicates (char [] X1) {

    int map = 0;

    for (int i = 0;

    i < X1.length; i ++) {

        if ((map & (1 << (X1 [i] - 'a'))) > 0) X1 [i] = 0;

        else map |= 1 << (X1 [i] - 'a');

    }

}
