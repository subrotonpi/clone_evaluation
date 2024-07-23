public static String compressBad (String str) {

    String compressedString = "";

    if (str != null && str.length () > 0) {

        int countConsecutive = 1;

        char X1 = str.charAt (0);

        for (int i = 1;

        i < str.length (); i ++) {

            if (str.charAt (i) != X1) {

                compressedString += String.valueOf (X1) + countConsecutive;

                X1 = str.charAt (i);

                countConsecutive = 1;

                continue;

            }

            countConsecutive ++;

        }

        compressedString += String.valueOf (X1) + countConsecutive;

    }

    return compressedString;

}
