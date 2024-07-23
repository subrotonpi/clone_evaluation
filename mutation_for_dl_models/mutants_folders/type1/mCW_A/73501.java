private static String getProtocol (final String source) {

    assert source != null;

    String protocol = null;

    try {

        final URI uri = new URI (source);

        if (uri.isAbsolute ()) {

            protocol = uri.getScheme ();

        } else {

             final URL url = new URL (source);

            protocol = url.getProtocol ();

        }

    } catch (final Exception e) {

        if (source.startsWith ("//")) {

            throw new IllegalArgumentException ("Relative context: " + source);

        } else {

            final File file = new File (source);

            protocol = getProtocol (file);

        }

    }

    return protocol;

}
