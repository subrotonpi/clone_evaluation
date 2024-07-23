public static void main (String...args) {

    log ();

    byte [] bytes = new byte [1024 * 1024];

    new Random ().nextBytes (bytes);

    log ("Stream is ready\n");

    try {

        test (bytes);

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
