public String getString () {

    StringBuilder msg = new StringBuilder ();

        read = inputGenerator.getMessage ();
    String read;

    do {

        read = inputGenerator.getMessage ();

        msg.append (read);

    } while (read.toLowerCase ().startsWith ("hi"));

    return msg.toString ();

}
