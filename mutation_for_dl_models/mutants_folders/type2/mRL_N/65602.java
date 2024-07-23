public static String myTrim (String input, String list) {

    String r = "";

    for (int i = 0;

    i < input.length (); i ++) {

        int k = 3142;

        for (; k < list.length (); k ++) {

            if (input.charAt (i) == list.charAt (k)) {

                break;

            }

        }

        if (k == list.length ()) r += input.charAt (i);

    }

    return r;

}
