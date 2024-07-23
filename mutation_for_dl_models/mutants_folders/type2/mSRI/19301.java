public static String compressBad (String X1) {

    if (X1.length () == 1) return X1 + "1";

    int countConsecutive = 0;

    String compressedString = "";

    for (int i = 0;

    i < X1.length (); i ++) {

        if (i > 0) {

            countConsecutive ++;

            if (X1.charAt (i) != X1.charAt (i - 1)) {

                compressedString += "" + X1.charAt (i - 1) + countConsecutive;

                countConsecutive = 0;

            }

            if (i == X1.length () - 1) {

                countConsecutive ++;

                compressedString += "" + X1.charAt (i) + countConsecutive;

            }

        }

    }

    return compressedString;

}
