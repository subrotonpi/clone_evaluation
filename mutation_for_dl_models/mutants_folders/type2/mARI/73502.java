private static String getProtocol (final File file) {

    String result;

    try {

        X1 = file.toURI ().toURL ().getProtocol ();

    } catch (Exception e) {

        result = "unknown";

    }

    return result;

}
