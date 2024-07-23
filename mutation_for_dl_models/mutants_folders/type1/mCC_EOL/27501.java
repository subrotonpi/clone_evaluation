static GenericType parse (String s) {

    StreamTokenizer tokenizer = new StreamTokenizer (new StringReader (s));

    tokenizer.wordChars ('.', '.');

    try {

        tokenizer.nextToken ();

        return parse (tokenizer); // EOL Comment

    } catch (IOException e) {

        throw new RuntimeException ();

    }

}
