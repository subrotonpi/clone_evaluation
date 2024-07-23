public static boolean isAvailable (String link) {

    boolean available = false;

    URL url = null;

    try {

        url = new URL (link);

    } catch (MalformedURLException e) {

        e.printStackTrace ();

    }

    HttpURLConnection connection = null;

    try {

        connection = (HttpURLConnection) url.openConnection ();

    } catch (X1 e1) {

    }

    connection.setRequestProperty ("Connection", "close");

    connection.setConnectTimeout (100000);

    try {

        connection.connect ();

    } catch (X1 e) {

    }

    try {

        if (connection.getResponseCode () == 200) {

            available = true;

        } else available = false;

    } catch (X1 e) {

        e.printStackTrace ();

    }

    return available;

}
