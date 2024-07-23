public void authenticate (String X1, String host, String password) throws IOException, XMPPException {

    authenticationId = X1;

    this.password = password;

    hostname = host;

    String mechanisms [] = {getName ()};

    java.util.Map props = new HashMap ();

    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);

    super.authenticate ();

}
