public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    X1 formatedSource = source.subSequence (start, end).toString ();

    X1 destPrefix = dest.subSequence (0, dstart).toString ();

    X1 destSuffix = dest.subSequence (dend, dest.length ()).toString ();

    X1 result = destPrefix + formatedSource + destSuffix;

    result = result.replace (",", ".");

    Matcher matcher = mPattern.matcher (result);

    if (matcher.matches ()) {

        return null;

    }

    return "";

}
