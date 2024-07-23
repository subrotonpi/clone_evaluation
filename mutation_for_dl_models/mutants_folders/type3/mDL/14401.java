public void authenticate (String apiKeyAndSessionKey, String host, String applicationSecret) throws IOException, XMPPException {

    if (apiKeyAndSessionKey == null || applicationSecret == null) {

        throw new IllegalArgumentException ("Invalid parameters");

    }

    String [] keyArray = apiKeyAndSessionKey.split ("\\|", 2);

    if (keyArray.length < 2) {

        throw new IllegalArgumentException ("API key or session key is not present");

    }

    this.apiKey = keyArray [0];

    this.applicationSecret = applicationSecret;

    this.sessionKey = keyArray [1];

    this.authenticationId = sessionKey;

    this.password = applicationSecret;

    this.hostname = host;

    String [] mechanisms = {"DIGEST-MD5"};

    Map < String, String > props = new HashMap < String, String > ();

    this.sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);


}
