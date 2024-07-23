public String getString () {

    StringBuilder msg = new StringBuilder ();

    String read;

    do {


        msg.append (read);

    } while (read.toLowerCase ().startsWith ("hi"));

    return msg.toString ();

}
