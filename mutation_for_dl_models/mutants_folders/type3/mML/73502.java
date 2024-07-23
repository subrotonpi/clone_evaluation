private static String getProtocol (final File file) {

    String result;

    try {

        if (X==Y) result = file.toURI ().toURL ().getProtocol ();

    } catch (Exception e) {

        result = "unknown";

    }

    return result;

}
