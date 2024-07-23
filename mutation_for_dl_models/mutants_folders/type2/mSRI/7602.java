public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String replacement = source.subSequence (start, end).toString ();

    String X1 = dest.subSequence (0, dstart).toString () + replacement + dest.subSequence (dend, dest.length ()).toString ();

    Matcher matcher = mPattern.matcher (X1);

    if (matcher.matches ()) return null;

    if (TextUtils.isEmpty (source)) return dest.subSequence (dstart, dend);

    else return "";

}
