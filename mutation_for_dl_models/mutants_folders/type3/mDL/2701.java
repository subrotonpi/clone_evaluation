static String transpose (String s) {

    char [] c = s.toCharArray ();

    int n = (int) Math.sqrt (s.length ());

    for (int i = 0;

    i < n; ++ i) {

        for (int j = i + 1;

        j < n; ++ j) {

            char h = c [i * n + j];

            c [i * n + j] = c [j * n + i];


        }

    }

    return new String (c);

}
