public static String compressBad (String str) {

    String X1 = "";

    if (str != null && str.length () > 0) {

        int countConsecutive = 1;

        char prevChar = str.charAt (0);

        for (int i = 1;

        i < str.length (); i ++) {

            if (str.charAt (i) != prevChar) {

                X1 += String.valueOf (prevChar) + countConsecutive;

                prevChar = str.charAt (i);

                countConsecutive = 1;

                continue;

            }

            countConsecutive ++;

        }

        X1 += String.valueOf (prevChar) + countConsecutive;

    }

    return X1;

}
