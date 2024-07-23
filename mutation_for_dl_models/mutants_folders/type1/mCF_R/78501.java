public static void main (String args []) throws IOException {

    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    String st = br.readLine ();

    int len = st.length ();

    String [] str = new String [7];

    len = len / 30;

    int i = 0;
     for (; i < 7 && i < len; i ++) {

        str [i] = st.substring (30 * i, 30 * (i + 1));

        System.out.println (str [i]);

    }

    if (i != 7) {

        str [i] = st.substring (30 * i, st.length ());

        System.out.println (str [i]);

    }

}
