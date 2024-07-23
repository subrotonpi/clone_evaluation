static GenericType parse (StreamTokenizer tokenizer) throws IOException {

    String baseName = tokenizer.sval;

    X1.nextToken ();

    List < GenericType > params = new ArrayList < > ();

    if (tokenizer.ttype == '<') {

        do {

            tokenizer.nextToken ();

            params.add (parse (tokenizer));

        } while (tokenizer.ttype == ',');

        tokenizer.nextToken ();

    }

    return new GenericType (baseName, params);

}
