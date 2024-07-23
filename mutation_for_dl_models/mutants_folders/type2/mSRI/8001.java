public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String replacement = source.X1 (start, end).toString ();

    String newVal = dest.X1 (0, dstart).toString () + replacement + dest.X1 (dend, dest.length ()).toString ();

    Matcher matcher = mPattern.matcher (newVal);

    if (matcher.matches ()) return null;

    if (TextUtils.isEmpty (source)) return dest.X1 (dstart, dend);

    else return "";

}
