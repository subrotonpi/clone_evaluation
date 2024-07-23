public static String merge (String...strings) {

    int maxLength = 0;

    StringBuilder sb = new StringBuilder ();

    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();

    for (int i = 0;

    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append ();

    return sb.toString ();

}
