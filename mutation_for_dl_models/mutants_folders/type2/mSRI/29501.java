int solution (int X1) {

    int tempGap = 0, gap = 0;

    String binaryString = Integer.toBinaryString (X1);

    int i = 0;

    while (i < binaryString.length ()) {

        if (binaryString.charAt (i) == '1') {

            ++ i;

            tempGap = 0;

            while (i < binaryString.length () && binaryString.charAt (i) != '1') {

                ++ i;

                tempGap ++;

            }

            if (i >= binaryString.length ()) {

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
