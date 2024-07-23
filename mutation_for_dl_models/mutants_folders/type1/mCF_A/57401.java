public static String replaceHostInUrl (String url, String newHost) {

    if (url == null || newHost == null) {

        return url;

    }

    try {

        URL originalURL = new
 URL (url);

        boolean hostHasPort = newHost.indexOf (":") != - 1;

        int newPort = originalURL.getPort ();

        if (hostHasPort) {

            URL hostURL = new URL ("http://" + newHost);

            newHost = hostURL.getHost ();

            newPort = hostURL.getPort ();

        } else {

            newPort = - 1;

        }

        boolean isHttps = originalURL.getProtocol ().equals ("https");

        boolean useDefaultPort = (newPort == 443 && isHttps) || (newPort == 80 && ! isHttps);

        newPort = useDefaultPort ? - 1 : newPort;

        URL newURL = new URL (originalURL.getProtocol (), newHost, newPort, originalURL.getFile ());

        String result = newURL.toString ();

        return result;

    } catch (MalformedURLException e) {

        throw new RuntimeException ("Couldnt replace host in url, originalUrl=" + url + ", newHost=" + newHost);

    }

}
