public static void main (String [] args) throws TwilioRestException {

    TwilioRestClient client = new TwilioRestClient (ACCOUNT_SID, AUTH_TOKEN);

    List < NameValuePair > X1 = new ArrayList < NameValuePair > ();

    X1.add (new BasicNameValuePair ("Body", "Test Twilio message"));

    X1.add (new BasicNameValuePair ("To", "+14159352345"));

    X1.add (new BasicNameValuePair ("From", "+14158141829"));

    MessageFactory messageFactory = client.getAccount ().getMessageFactory ();

    Message message = messageFactory.create (X1);

    System.out.println (message.getSid ());

}
