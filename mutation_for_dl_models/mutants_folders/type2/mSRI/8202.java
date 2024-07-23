public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    int X1 = - 1;

    int len = dest.length ();

    for (int i = 0;

    i < len; i ++) {

        char c = dest.charAt (i);

        if (c == '.' || c == ',') {

            X1 = i;

            break;

        }

    }

    if (X1 >= 0) {

        if (source.equals (".") || source.equals (",")) {

            return "";

        }

        if (dend <= X1) {

            return null;

        }

        if (len - X1 > decimalDigits) {

            return "";

        }

    }

    return null;

}
