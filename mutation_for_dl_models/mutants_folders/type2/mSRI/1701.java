public String longestSequenceOfChar (String str) {

    String result = "";

    for (int i = 0;

    i < str.length (); i ++) {

        int X1 = i;

        while (X1 < str.length () && str.charAt (X1) == str.charAt (i)) {

            X1 ++;

        }

        if (X1 - i > result.length ()) {

            result = str.substring (i, X1);

        }

    }

    return result;

}
