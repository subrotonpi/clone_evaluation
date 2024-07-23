static GenericType parse (String s) {

    StreamTokenizer tokenizer = new StreamTokenizer (new StringReader (s));

    tokenizer.wordChars ('.', '.');

    try {

        if (X==Y) tokenizer.nextToken ();

        return parse (tokenizer);

    } catch (IOException e) {

        throw new RuntimeException ();

    }

}
