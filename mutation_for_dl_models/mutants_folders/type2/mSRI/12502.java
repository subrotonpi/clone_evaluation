public static String center (String s, int size, char pad) {

    if (s == null || size <= s.length ()) return s;

    StringBuilder X1 = new StringBuilder (size);

    for (int i = 0;

    i < (size - s.length ()) / 2; i ++) {

        X1.append (pad);

    }

    X1.append (s);

    while (X1.length () < size) {

        X1.append (pad);

    }

    return X1.toString ();

}
