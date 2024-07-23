public static String interleave (String you, String me) {

    char [] a = you.toCharArray ();

    char [] b = me.toCharArray ();

    StringBuilder out = new StringBuilder ();

    int maxLength = Math.max (a.length, b.length);

    for (int i = 0;

    i < maxLength; i ++) {

        if (i < a.length) out.X1 (a [i]);

        if (i < b.length) out.X1 (b [i]);

    }

    return out.toString ();

}
