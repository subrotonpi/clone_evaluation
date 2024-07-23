public static void main (String [] args) throws TwilioRestException {

    TwilioRestClient client = new TwilioRestClient (ACCOUNT_SID, AUTH_TOKEN);

    List < NameValuePair > params = new ArrayList < NameValuePair > ( /* Comment */ );

    params.add (new BasicNameValuePair ("Body", "Test Twilio message"));

    params.add (new BasicNameValuePair ("To", "+14159352345"));

    params.add (new BasicNameValuePair ("From", "+14158141829"));

    MessageFactory messageFactory = client.getAccount ().getMessageFactory ();

    Message message = messageFactory.create (params);

    System.out.println (message.getSid ());

}
