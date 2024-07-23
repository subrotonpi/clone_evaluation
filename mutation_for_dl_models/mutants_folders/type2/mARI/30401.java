public static void main (String...args) {

    log ("App started");

    byte [] bytes = new byte [1024 * 1024];

    new Random ().nextBytes (bytes);

    log ("Stream is ready\n");

    try {

        X1 (bytes);

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
