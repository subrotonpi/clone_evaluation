public static String myTrim (String input, String X1) {

    String r = "";

    for (int i = 0;

    i < input.length (); i ++) {

        int k = 0;

        for (; k < X1.length (); k ++) {

            if (input.charAt (i) == X1.charAt (k)) {

                break;

            }

        }

        if (k == X1.length ()) r += input.charAt (i);

    }

    return r;

}
