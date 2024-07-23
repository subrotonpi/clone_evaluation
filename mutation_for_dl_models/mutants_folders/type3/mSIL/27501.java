static GenericType parse (String s) {

    StreamTokenizer tokenizer = new StreamTokenizer (new StringReader (s),X1);

    tokenizer.wordChars ('.', '.');

    try {

        tokenizer.nextToken ();

        return parse (tokenizer);

    } catch (IOException e) {

        throw new RuntimeException ();

    }

}
