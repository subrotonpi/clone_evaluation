static String transpose (String s) {

    char [] c = s.toCharArray ();

    int n = () Math.sqrt (s.length ());

    for (int i = 0;

    i < n; ++ i) {

        for (int j = i + 1;

        j < n; ++ j) {

            char h = c [i * n + j];

            c [i * n + j] = c [j * n + i];

            c [j * n + i] = h;

        }

    }

    return new String (c);

}
