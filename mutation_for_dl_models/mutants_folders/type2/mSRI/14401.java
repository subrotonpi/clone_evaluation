public void authenticate (String apiKeyAndSessionKey, String host, String X1) throws IOException, XMPPException {

    if (apiKeyAndSessionKey == null || X1 == null) {

        throw new IllegalArgumentException ("Invalid parameters");

    }

    String [] keyArray = apiKeyAndSessionKey.split ("\\|", 2);

    if (keyArray.length < 2) {

        throw new IllegalArgumentException ("API key or session key is not present");

    }

    this.apiKey = keyArray [0];

    this.X1 = X1;

    this.sessionKey = keyArray [1];

    this.authenticationId = sessionKey;

    this.password = X1;

    this.hostname = host;

    String [] mechanisms = {"DIGEST-MD5"};

    Map < String, String > props = new HashMap < String, String > ();

    this.sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);

    authenticate ();

}
