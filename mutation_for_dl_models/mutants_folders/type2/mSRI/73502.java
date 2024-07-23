private static String getProtocol (final File X1) {

    String result;

    try {

        result = X1.toURI ().toURL ().getProtocol ();

    } catch (Exception e) {

        result = "unknown";

    }

    return result;

}
