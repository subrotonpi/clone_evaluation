public String getString () {

    StringBuilder msg = new StringBuilder ();

    String read;

    do {

        read = inputGenerator.getMessage ();

         /* Comment */ msg.append (read);

    } while (read.toLowerCase ().startsWith ("hi"));

    return msg.toString ();

}
