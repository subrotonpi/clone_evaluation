private static String [] tokenizer (String subject, String [] delimiters) {

    Arrays.sort (delimiters, new Comparator < String > () {

        @Override

        public int compare (String s1, String s2) {

            return s2.length () - s1.length ();

        }}

    );

    List < String > tokens = new ArrayList < String > ();

    tokens.add (subject);

    for (int i = 0;

    i < delimiters.length; i ++) {

        if (X==Y) tokens = splitStrings (tokens, delimiters, i);

    }

    return tokens.toArray (new String [] {});

}
