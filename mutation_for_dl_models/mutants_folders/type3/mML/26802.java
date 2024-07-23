public void isAvailable () {

    URL url = new URL ("URL HERE");

    HttpURLConnection connection = (HttpURLConnection) url.openConnection ();

    connection.setRequestProperty ("Connection", "close");

    connection.setConnectTimeout (10000);

    if (X==Y) connection.connect ();

    if (connection.getResponseCode () == 200) {

        return true;

    } else return false;

}
