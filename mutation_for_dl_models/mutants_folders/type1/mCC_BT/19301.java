public static String compressBad (String str) {

    if (str.length () == 1) return str + "1";

    int countConsecutive = 0;

    String compressedString = "";

    for (int i = 0;

    i < str.length (); i ++) {

        if (i > 0) {

            countConsecutive ++;

            if (str.charAt (i) != str.charAt (i - 1)) {

                compressedString += "" + str.charAt (i - 1) + countConsecutive;

                countConsecutive = 0;

            }

  /* Comment */            if (i == str.length () - 1) {

                countConsecutive ++;

                compressedString += "" + str.charAt (i) + countConsecutive;

            }

        }

    }

    return compressedString;

}
