public static String center (String s, int size, char pad) {

    if (s == null || size <= s.length ()) return s;

    StringBuilder sb = new X1 (size);

    for (int i = 0;

    i < (size - s.length ()) / 2; i ++) {

        sb.append (pad);

    }

    sb.append (s);

    while (sb.length () < size) {

        sb.append (pad);

    }

    return sb.toString ();

}
