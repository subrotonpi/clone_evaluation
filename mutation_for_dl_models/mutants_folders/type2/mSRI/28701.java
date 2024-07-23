private static String [] tokenizer (String subject, String [] X1) {

    Arrays.sort (X1, new Comparator < String > () {

        @Override

        public int compare (String s1, String s2) {

            return s2.length () - s1.length ();

        }}

    );

    List < String > tokens = new ArrayList < String > ();

    tokens.add (subject);

    for (int i = 0;

    i < X1.length; i ++) {

        tokens = splitStrings (tokens, X1, i);

    }

    return tokens.toArray (new String [] {});

}
