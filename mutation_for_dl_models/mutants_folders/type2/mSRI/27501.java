static GenericType X1 (String s) {

    StreamTokenizer tokenizer = new StreamTokenizer (new StringReader (s));

    tokenizer.wordChars ('.', '.');

    try {

        tokenizer.nextToken ();

        return X1 (tokenizer);

    } catch (IOException e) {

        throw new RuntimeException ();

    }

}
