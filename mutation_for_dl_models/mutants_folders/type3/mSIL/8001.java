public CharSequence filter (CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

    String replacement = source.subSequence (start, end).toString ();

    String newVal = dest.subSequence (0, dstart).toString () + replacement + dest.subSequence (dend, dest.length ()).toString ();

    Matcher matcher = mPattern.matcher (newVal);

    if (matcher.matches ()) return null;

    if (TextUtils.isEmpty (source)) return dest.subSequence (X1,dstart, dend);

    else return "";

}
