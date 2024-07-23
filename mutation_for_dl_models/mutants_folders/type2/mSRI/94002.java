public String getString () {

    StringBuilder X1 = new StringBuilder ();

    String read;

    do {

        read = inputGenerator.getMessage ();

        X1.append (read);

    } while (read.toLowerCase ().startsWith ("hi"));

    return X1.toString ();

}
