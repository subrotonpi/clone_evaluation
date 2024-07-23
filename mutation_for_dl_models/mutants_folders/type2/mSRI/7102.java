public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String lsStart = "";

    String lsInsert = "";

    String X1 = "";

    String lsText = "";

    Log.d ("debug", moPattern.toString ());

    Log.d ("debug", "source: " + source + ", start: " + start + ", end:" + end + ", dest: " + dest + ", dstart: " + dstart + ", dend: " + dend);

    lsText = dest.toString ();

    if (lsText.length () > 0) {

        lsStart = lsText.substring (0, dstart);

        Log.d ("debug", "lsStart : " + lsStart);

        if (source != "") {

            lsInsert = source.toString ();

            Log.d ("debug", "lsInsert: " + lsInsert);

        }

        X1 = lsText.substring (dend);

        Log.d ("debug", "lsEnd   : " + X1);

        lsText = lsStart + lsInsert + X1;

        Log.d ("debug", "lsText  : " + lsText);

    }

    Matcher loMatcher = moPattern.matcher (lsText);

    Log.d ("debug", "loMatcher.matches(): " + loMatcher.matches () + ", lsText: " + lsText);

    if (! loMatcher.matches ()) {

        return "";

    }

    return null;

}
