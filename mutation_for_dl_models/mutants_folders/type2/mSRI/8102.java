public CharSequence filter (CharSequence source, int start, int end, Spanned X1, int dstart, int dend) {

    int dotPos = - 1;

    int len = X1.length ();

    for (int i = 0;

    i < len; i ++) {

        char c = X1.charAt (i);

        if (c == '.' || c == ',') {

            dotPos = i;

            break;

        }

    }

    if (dotPos >= 0) {

        if (source.equals (".") || source.equals (",")) {

            return "";

        }

        if (dend <= dotPos) {

            return null;

        }

        if (len - dotPos > decimalDigits) {

            return "";

        }

    }

    return null;

}
