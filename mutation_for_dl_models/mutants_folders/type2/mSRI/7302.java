public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    CharSequence out = super.filter (source, start, end, dest, dstart, dend);

    if (out != null) {

        source = out;

        start = 0;

        end = out.length ();

    }

    int len = end - start;

    if (len == 0) {

        return source;

    }

    int dlen = dest.length ();

    for (int X1 = 0;

    X1 < dstart; X1 ++) {

        if (dest.charAt (X1) == '.') {

            return (dlen - (X1 + 1) + len > digits) ? "" : new SpannableStringBuilder (source, start, end);

        }

    }

    for (int X1 = start;

    X1 < end; ++ X1) {

        if (source.charAt (X1) == '.') {

            if ((dlen - dend) + (end - (X1 + 1)) > digits) return "";

            else break;

        }

    }

    return new SpannableStringBuilder (source, start, end);

}
