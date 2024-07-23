public static String output (String [] fourLetter, String [] fiveLetter, String [] sixLetter) {

    String X1 = "";

    int count = 1;

    for (int i = 0;

    i < Math.max (Math.max (fourLetter.length, fiveLetter.length), sixLetter.length); i ++) {

        if (sixLetter.length > i) {

            X1 += sixLetter [i] + " ";

        }

        if (fiveLetter.length > i) {

            X1 += fiveLetter [i] + " ";

        }

        if (fourLetter.length > i) {

            X1 += fourLetter [i];

        }

        X1 += "\n";

        for (int j = 0;

        j < count; j ++) {

            X1 += "\t";

        }

        count ++;

    }

    return X1;

}
