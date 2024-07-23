public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String formatedSource = source.subSequence (start, end).toString ();

    String destPrefix = dest.subSequence (0, dstart).toString ();

    String destSuffix = dest.subSequence (dend, dest.length ()).toString ();

    String X1 = destPrefix + formatedSource + destSuffix;

    X1 = X1.replace (",", ".");

    Matcher matcher = mPattern.matcher (X1);

    if (matcher.matches ()) {

        return null;

    }

    return "";

}
