public static void main (String [] args) throws Exception {

    AuthMethod X1 = new TokenAuthMethod (API_KEY, API_SECRET);

    NexmoClient client = new NexmoClient (X1);

    TextMessage message = new TextMessage (FROM_NUMBER, TO_NUMBER, "Hello from Nexmo!");

    SmsSubmissionResult [] responses = client.getSmsClient ().submitMessage (message);

    for (SmsSubmissionResult response : responses) {

        System.out.println (response);

    }

}
