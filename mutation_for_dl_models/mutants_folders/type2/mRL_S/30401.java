public static void main (String...args) {

    log ("App started");

    byte [] bytes = new byte [1024 * 1024];

    new Random ().nextBytes (bytes);

    log ("ArtificialStringReplacement");

    try {

        test (bytes);

    } catch (IOException e) {

        e.printStackTrace ();

    }

}
