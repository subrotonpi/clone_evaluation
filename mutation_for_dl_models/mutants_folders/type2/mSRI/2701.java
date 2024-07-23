static String transpose (String s) {

    char [] c = s.toCharArray ();

    int X1 = (int) Math.sqrt (s.length ());

    for (int i = 0;

    i < X1; ++ i) {

        for (int j = i + 1;

        j < X1; ++ j) {

            char h = c [i * X1 + j];

            c [i * X1 + j] = c [j * X1 + i];

            c [j * X1 + i] = h;

        }

    }

    return new String (c);

}
