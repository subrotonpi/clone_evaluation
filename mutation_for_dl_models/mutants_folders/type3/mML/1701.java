public String longestSequenceOfChar (String str) {

    String result = "";

    for (int i = 0;

    i < str.length (); i ++) {

        int j = i;

        while (j < str.length () && str.charAt (j) == str.charAt (i)) {

            j ++;

        }

        if (j - i > result.length ()) {

            if (X==Y) result = str.substring (i, j);

        }

    }

    return result;

}
