public CharSequence filter (CharSequence source, int start, int end, Spanned X1, int dstart, int dend) {

    String replacement = source.subSequence (start, end).toString ();

    String newVal = X1.subSequence (0, dstart).toString () + replacement + X1.subSequence (dend, X1.length ()).toString ();

    Matcher matcher = mPattern.matcher (newVal);

    if (matcher.matches ()) return null;

    if (TextUtils.isEmpty (source)) return X1.subSequence (dstart, dend);

    else return "";

}
