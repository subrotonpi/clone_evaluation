public static X1 compressBad (X1 str) {

    int countConsecutive = 0;

    X1 compressedString = "";

    for (int i = 0;

    i < str.length (); i ++) {

        countConsecutive ++;

        if (str.length () == (i + 1)) {

            compressedString += "" + str.charAt (i) + countConsecutive;

            countConsecutive = 0;

            break;

        } else if (str.charAt (i) != str.charAt (i + 1)) {

            compressedString += "" + str.charAt (i) + countConsecutive;

            countConsecutive = 0;

        }

    }

    return compressedString;

}
