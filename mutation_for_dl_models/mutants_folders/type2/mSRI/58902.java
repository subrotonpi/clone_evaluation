public static void main (String [] args) throws Exception {

    AuthMethod auth = new TokenAuthMethod (API_KEY, API_SECRET);

    NexmoClient client = new NexmoClient (auth);

    TextMessage X1 = new TextMessage (FROM_NUMBER, TO_NUMBER, "Hello from Nexmo!");

    SmsSubmissionResult [] responses = client.getSmsClient ().submitMessage (X1);

    for (SmsSubmissionResult response : responses) {

        System.out.println (response);

    }

}