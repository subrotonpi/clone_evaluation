public void handle (HttpExchange t) throws IOException {

    String response = "This is the response";

    long threadId = Thread.currentThread ().getId ();

    System.out.println ("I am thread " + threadId);

    response = response + "Thread Id = " + threadId;

    t.sendResponseHeaders (200, response.length ());

    OutputStream X1 = t.getResponseBody ();

    X1.write (response.getBytes ());

    X1.close ();

}
