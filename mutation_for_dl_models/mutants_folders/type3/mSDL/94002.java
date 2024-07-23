public String getString () {

    StringBuilder msg = new StringBuilder ();

    String read;

    do {

        read = inputGenerator.getMessage ();

        msg.append (read);

    } while (read.toLowerCase ().startsWith ());

    return msg.toString ();

}
