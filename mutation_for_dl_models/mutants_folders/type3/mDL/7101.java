public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String formatedSource = source.subSequence (start, end).toString ();

    String destPrefix = dest.subSequence (0, dstart).toString ();

    String destSuffix = dest.subSequence (dend, dest.length ()).toString ();


    result = result.replace (",", ".");

    Matcher matcher = mPattern.matcher (result);

    if (matcher.matches ()) {

        return null;

    }

    return "";

}
