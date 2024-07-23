public void isAvailable () {

    URL url = new URL ("URL HERE");

    HttpURLConnection connection = (HttpURLConnection) url.openConnection ();

    connection.setRequestProperty ("Connection");

    connection.setConnectTimeout (10000);

    connection.connect ();

    if (connection.getResponseCode () == 200) {

        return true;

    } else return false;

}
