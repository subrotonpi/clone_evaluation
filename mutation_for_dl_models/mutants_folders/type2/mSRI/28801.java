private static String [] tokenizer (String subject, String [] delimiters) {

    Arrays.sort (delimiters, new Comparator < String > () {

        @Override

        public int compare (String s1, String s2) {

            return s2.length () - s1.length ();

        }}

    );

    List < String > tokens = new ArrayList < String > ();

    tokens.add (subject);

    for (int X1 = 0;

    X1 < delimiters.length; X1 ++) {

        tokens = splitStrings (tokens, delimiters, X1);

    }

    return tokens.toArray (new String [] {});

}
