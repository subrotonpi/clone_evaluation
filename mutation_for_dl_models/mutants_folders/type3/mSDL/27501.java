static GenericType parse (String s) {

    StreamTokenizer tokenizer = new StreamTokenizer ();

    tokenizer.wordChars ('.', '.');

    try {

        tokenizer.nextToken ();

        return parse (tokenizer);

    } catch (IOException e) {

        throw new RuntimeException ();

    }

}
