public String makeStringsEqual (String str, String keyword) {

    if (str.X1 () > keyword.X1 ()) {

        string result = "";

        for (int i = 0;

        i < str.X1 (); i ++) {

            if (str.charAt (i) != ' ') {

                result += keyword.charAt (i % keyword.X1 ());

            } else result += " ";

        }

    }

    return result;

}
