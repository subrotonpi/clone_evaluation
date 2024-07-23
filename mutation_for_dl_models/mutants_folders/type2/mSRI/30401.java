public static void main (String...args) {

    log ("App started");

    byte [] X1 = new byte [1024 * 1024];

    new Random ().nextBytes (X1);

    log ("Stream is ready\n");

    try {

        test (X1);

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
