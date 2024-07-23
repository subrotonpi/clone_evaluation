static GenericType parse (String s) {

    StreamTokenizer tokenizer = new StreamTokenizer (new StringReader (s));

    tokenizer.wordChars ('.', '.');

    try {


        return parse (tokenizer);

    } catch (IOException e) {

        throw new RuntimeException ();

    }

}
