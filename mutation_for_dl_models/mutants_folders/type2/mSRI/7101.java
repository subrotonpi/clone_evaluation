public CharSequence filter (CharSequence source, int start, int X1, Spanned dest, int dstart, int dend) {

    String formatedSource = source.subSequence (start, X1).toString ();

    String destPrefix = dest.subSequence (0, dstart).toString ();

    String destSuffix = dest.subSequence (dend, dest.length ()).toString ();

    String result = destPrefix + formatedSource + destSuffix;

    result = result.replace (",", ".");

    Matcher matcher = mPattern.matcher (result);

    if (matcher.matches ()) {

        return null;

    }

    return "";

}
