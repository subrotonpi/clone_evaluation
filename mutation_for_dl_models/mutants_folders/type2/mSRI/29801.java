public int solution (int N) {

    String binary = Integer.toString (N, 2);

    int X1 = 0;

    for (int i = 1, gap = 0;

    i < binary.length (); i ++) {

        while (i < binary.length () && binary.charAt (i) == '0') {

            i ++;

            gap ++;

        }

        if (gap > X1 && i < binary.length ()) {

            X1 = gap;

        }

        gap = 0;

    }

    return X1;

}
