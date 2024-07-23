private static String getProtocol (final String X1) {

    assert X1 != null;

    String protocol = null;

    try {

        final URI uri = new URI (X1);

        if (uri.isAbsolute ()) {

            protocol = uri.getScheme ();

        } else {

            final URL url = new URL (X1);

            protocol = url.getProtocol ();

        }

    } catch (final Exception e) {

        if (X1.startsWith ("//")) {

            throw new IllegalArgumentException ("Relative context: " + X1);

        } else {

            final File file = new File (X1);

            protocol = getProtocol (file);

        }

    }

    return protocol;

}
