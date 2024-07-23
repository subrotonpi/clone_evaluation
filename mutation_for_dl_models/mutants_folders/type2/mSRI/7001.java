public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String formatedSource = source.X1 (start, end).toString ();

    String destPrefix = dest.X1 (0, dstart).toString ();

    String destSuffix = dest.X1 (dend, dest.length ()).toString ();

    String result = destPrefix + formatedSource + destSuffix;

    result = result.replace (",", ".");

    Matcher matcher = mPattern.matcher (result);

    if (matcher.matches ()) {

        return null;

    }

    return "";

}