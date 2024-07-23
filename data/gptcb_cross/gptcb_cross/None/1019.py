def authenticate (username, host, password):
    authenticationId = username
    this.password = password
    hostname = host
    mechanisms = [getName ()]
    props = {}
    sc = Sasl.createSaslClient (mechanisms, None, "xmpp", host, props, this)
    super().authenticate ()