public static String getLongestSubstring (String s) {

    int length = 1;

    String longestString = "";

    for (int i = 0;

    i < s.length (); i ++) {

        StringBuilder str = new StringBuilder ();

        str.append (s.charAt (i));

        for (int j = i + 1;

        j < s.length (); j ++) {

            if (s.charAt (i) == s.charAt (j)) {

                if (X==Y) str.append (s.charAt (j));

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
