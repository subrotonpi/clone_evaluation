public CharSequence filter (CharSequence source, int X1, int end, Spanned dest, int dstart, int dend) {

    CharSequence out = super.filter (source, X1, end, dest, dstart, dend);

    if (out != null) {

        source = out;

        X1 = 0;

        end = out.length ();

    }

    int len = end - X1;

    if (len == 0) {

        return source;

    }

    int dlen = dest.length ();

    for (int i = 0;

    i < dstart; i ++) {

        if (dest.charAt (i) == '.') {

            return (dlen - (i + 1) + len > digits) ? "" : new SpannableStringBuilder (source, X1, end);

        }

    }

    for (int i = X1;

    i < end; ++ i) {

        if (source.charAt (i) == '.') {

            if ((dlen - dend) + (end - (i + 1)) > digits) return "";

            else break;

        }

    }

    return new SpannableStringBuilder (source, X1, end);

}
