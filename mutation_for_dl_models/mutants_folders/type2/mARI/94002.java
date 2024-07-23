public String getString () {

    StringBuilder msg = new StringBuilder ();

    String read;

    do {

        X1 = inputGenerator.getMessage ();

        msg.append (read);

    } while (read.toLowerCase ().startsWith ("hi"));

    return msg.toString ();

}
