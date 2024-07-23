static GenericType parse (StreamTokenizer X1) throws IOException {

    String baseName = X1.sval;

    X1.nextToken ();

    List < GenericType > params = new ArrayList < > ();

    if (X1.ttype == '<') {

        do {

            X1.nextToken ();

            params.add (parse (X1));

        } while (X1.ttype == ',');

        X1.nextToken ();

    }

    return new GenericType (baseName, params);

}
