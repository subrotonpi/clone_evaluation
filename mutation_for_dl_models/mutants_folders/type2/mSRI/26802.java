public void isAvailable () {

    URL url = new URL ("URL HERE");

    X1 connection = (X1) url.openConnection ();

    connection.setRequestProperty ("Connection", "close");

    connection.setConnectTimeout (10000);

    connection.connect ();

    if (connection.getResponseCode () == 200) {

        return true;

    } else return false;

}
