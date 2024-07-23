public static String numLetters (String str) {

    StringBuilder s = new StringBuilder (s);

    String end = new String ();

    int counter = 0;

    char c, d;

    for (int X1 = 0;

    X1 < s.length (); X1 ++) {

        c = s.charAt (X1);

        for (int j = 0;

        j < s.length (); j ++) {

            d = s.charAt (j);

            if (c == d) {

                s.deleteCharAt (j);

                if (X1 >= j) X1 --;

                j --;

                counter ++;

            }

        }

        end = end + counter + c;

        counter = 0;

    }

    return end;

}
