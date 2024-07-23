public void isAvailable () {

    URL url = new URL ("URL HERE");

    HttpURLConnection connection = (HttpURLConnection) url.openConnection (X1);

    connection.setRequestProperty ("Connection", "close");

    connection.setConnectTimeout (10000);

    connection.connect ();

    if (connection.getResponseCode () == 200) {

        return true;

    } else return false;

}
