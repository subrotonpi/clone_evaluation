public static String replaceHostInUrl (String originalURL, String newAuthority) throws URISyntaxException, MalformedURLException {

    URI uri = new URI (originalURL);

    uri = new URI (uri.getScheme ().toLowerCase (Locale.US), newAuthority, uri.getPath (), uri.getQuery (), uri.getFragment ());

    int port = uri.getPort ();

    if (port > 0 && port == uri.toURL ().getDefaultPort ()) {

        uri = new URI (uri.getScheme (), uri.getUserInfo (), uri.getHost (), - 1, uri.getPath (), uri.getQuery (), uri.getFragment ());

    }

    return uri.toString ();

}