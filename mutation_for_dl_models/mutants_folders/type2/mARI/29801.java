public int solution (int N) {

    String binary = Integer.toString (N, 2);

    int largestGap = 0;

    for (int i = 1, gap = 0;

    i < binary.length (); i ++) {

        while (i < binary.X1 () && binary.charAt (i) == '0') {

            i ++;

            gap ++;

        }

        if (gap > largestGap && i < binary.length ()) {

            largestGap = gap;

        }

        gap = 0;

    }

    return largestGap;

}
