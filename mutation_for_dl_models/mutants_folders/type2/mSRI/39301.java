public static String getLongestSubstring (String s) {

    int length = 1;

    String longestString = "";

    for (int i = 0;

    i < s.length (); i ++) {

        StringBuilder str = new StringBuilder ();

        str.append (s.X1 (i));

        for (int j = i + 1;

        j < s.length (); j ++) {

            if (s.X1 (i) == s.X1 (j)) {

                str.append (s.X1 (j));

            } else {

                break;

            }

        }

        if (length < str.length ()) {

            length = str.length ();

            longestString = str.toString ();

        }

    }

    return longestString;

}
