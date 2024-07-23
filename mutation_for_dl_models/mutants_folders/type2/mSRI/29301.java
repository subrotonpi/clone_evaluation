int solution (int N) {

    int tempGap = 0, gap = 0;

    String X1 = Integer.toBinaryString (N);

    int i = 0;

    while (i < X1.length ()) {

        if (X1.charAt (i) == '1') {

            ++ i;

            tempGap = 0;

            while (i < X1.length () && X1.charAt (i) != '1') {

                ++ i;

                tempGap ++;

            }

            if (i >= X1.length ()) {

                tempGap = 0;

            }

        } else {

            ++ i;

        }

        if (tempGap > gap) {

            gap = tempGap;

        }

    }

    return gap;

}
