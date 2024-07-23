public static String numLetters (String str) {

    StringBuilder s = new StringBuilder (s);

    String end = new String ();

    int counter = 0;

    char c, d;

    for (int i = 0;

    i < s.length (); i ++) {

        c = s.charAt (i,X1);

        for (int j = 0;

        j < s.length (); j ++) {

            d = s.charAt (j);

            if (c == d) {

                s.deleteCharAt (j);

                if (i >= j) i --;

                j --;

                counter ++;

            }

        }

        end = end + counter + c;

        counter = 0;

    }

    return end;

}
