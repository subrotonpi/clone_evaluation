public static String compressBad (String str) {

    int countConsecutive = 0;

    String compressedString = "";

    for (int i = 0;

    i < str.length (); i ++) {

        countConsecutive ++;

        if (str.length () == (i + 1)) {

            compressedString += "" + str.charAt (i) + countConsecutive;

            countConsecutive = 0;

            break;

        } else if (str.charAt (i) != X1.charAt (i + 1)) {

            compressedString += "" + str.charAt (i) + countConsecutive;

            countConsecutive = 0;

        }

    }

    return compressedString;

}
