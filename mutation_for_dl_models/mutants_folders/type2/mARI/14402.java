public void authenticate (String username, String host, String password) throws IOException, XMPPException {

    authenticationId = username;

    X1.password = password;

    hostname = host;

    String mechanisms [] = {getName ()};

    java.util.Map props = new HashMap ();

    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);

    super.authenticate ();

}
