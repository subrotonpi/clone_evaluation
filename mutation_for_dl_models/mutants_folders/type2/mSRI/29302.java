public int solution (int N) {

    String binary = Integer.toString (N, 2);

    int largestGap = 0;

    for (int X1 = 1, gap = 0;

    X1 < binary.length (); X1 ++) {

        while (X1 < binary.length () && binary.charAt (X1) == '0') {

            X1 ++;

            gap ++;

        }

        if (gap > largestGap && X1 < binary.length ()) {

            largestGap = gap;

        }

        gap = 0;

    }

    return largestGap;

}
