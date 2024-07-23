public CharSequence filter (CharSequence X1, int start, int end, Spanned dest, int dstart, int dend) {

    String lsStart = "";

    String lsInsert = "";

    String lsEnd = "";

    String lsText = "";

    Log.d ("debug", moPattern.toString ());

    Log.d ("debug", "source: " + X1 + ", start: " + start + ", end:" + end + ", dest: " + dest + ", dstart: " + dstart + ", dend: " + dend);

    lsText = dest.toString ();

    if (lsText.length () > 0) {

        lsStart = lsText.substring (0, dstart);

        Log.d ("debug", "lsStart : " + lsStart);

        if (X1 != "") {

            lsInsert = X1.toString ();

            Log.d ("debug", "lsInsert: " + lsInsert);

        }

        lsEnd = lsText.substring (dend);

        Log.d ("debug", "lsEnd   : " + lsEnd);

        lsText = lsStart + lsInsert + lsEnd;

        Log.d ("debug", "lsText  : " + lsText);

    }

    Matcher loMatcher = moPattern.matcher (lsText);

    Log.d ("debug", "loMatcher.matches(): " + loMatcher.matches () + ", lsText: " + lsText);

    if (! loMatcher.matches ()) {

        return "";

    }

    return null;

}
