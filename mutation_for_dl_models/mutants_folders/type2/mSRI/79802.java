public static String merge (String...strings) {

    int maxLength = 0;

    StringBuilder sb = new StringBuilder ();

    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();

    for (int X1 = 0;

    X1 < maxLength; X1 ++) for (String s : strings) if (s.length () > X1) sb.append (s.charAt (X1));

    return sb.toString ();

}
