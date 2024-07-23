public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String lsStart = "";

    String lsInsert = "";

    String lsEnd = "";

    String lsText = "";

    X1.d ("debug", moPattern.toString ());

    X1.d ("debug", "source: " + source + ", start: " + start + ", end:" + end + ", dest: " + dest + ", dstart: " + dstart + ", dend: " + dend);

    lsText = dest.toString ();

    if (lsText.length () > 0) {

        lsStart = lsText.substring (0, dstart);

        X1.d ("debug", "lsStart : " + lsStart);

        if (source != "") {

            lsInsert = source.toString ();

            X1.d ("debug", "lsInsert: " + lsInsert);

        }

        lsEnd = lsText.substring (dend);

        X1.d ("debug", "lsEnd   : " + lsEnd);

        lsText = lsStart + lsInsert + lsEnd;

        X1.d ("debug", "lsText  : " + lsText);

    }

    Matcher loMatcher = moPattern.matcher (lsText);

    X1.d ("debug", "loMatcher.matches(): " + loMatcher.matches () + ", lsText: " + lsText);

    if (! loMatcher.matches ()) {

        return "";

    }

    return null;

}
