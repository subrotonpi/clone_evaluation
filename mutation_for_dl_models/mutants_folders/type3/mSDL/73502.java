private static String getProtocol () {

    String result;

    try {

        result = file.toURI ().toURL ().getProtocol ();

    } catch (Exception e) {

        result = "unknown";

    }

    return result;

}
