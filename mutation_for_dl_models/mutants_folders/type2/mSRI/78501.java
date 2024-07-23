public static void main (String args []) throws IOException {

    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    String st = br.readLine ();

    int len = st.length ();

    String [] X1 = new String [7];

    len = len / 30;

    int i = 0;

    for (; i < 7 && i < len; i ++) {

        X1 [i] = st.substring (30 * i, 30 * (i + 1));

        System.out.println (X1 [i]);

    }

    if (i != 7) {

        X1 [i] = st.substring (30 * i, st.length ());

        System.out.println (X1 [i]);

    }

}
