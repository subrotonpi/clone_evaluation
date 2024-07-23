public void handle (HttpExchange t) throws IOException {

    String response = "This is the response";

    long threadId= Thread.currentThread ().getId ();

    System.out.println ("I am thread " + threadId);

    response = response + "Thread Id = " + threadId;

    t.sendResponseHeaders (200, response.length ());

    OutputStream os = t.getResponseBody ();

    os.write (response.getBytes ());

    os.close ();

}
