public void handle (final HttpExchange ex) throws IOException {

    byte [] inBytes = getBytes (ex.getRequestBody ());

    ex.getRequestBody ().close ();

    final ByteArrayInputStream newInput = new ByteArrayInputStream (inBytes); // EOL Comment

    final ServletInputStream is = new ServletInputStream () {

        @Override

        public int read () throws IOException {

            return newInput.read ();

        }}

    ;

    Map < String, String [] > parsePostData = new HashMap < > ();

    try {

        parsePostData.putAll (HttpUtils.parseQueryString (ex.getRequestURI ().getQuery ()));

        parsePostData.putAll (HttpUtils.parsePostData (inBytes.length, is));

    } catch (IllegalArgumentException e) {

        newInput.reset ();

    }

    final Map < String, String [] > postData = parsePostData;

    RequestWrapper req = new RequestWrapper (createUnimplementAdapter (HttpServletRequest.class), ex, postData, is);

    ResponseWrapper resp = new ResponseWrapper (createUnimplementAdapter (HttpServletResponse.class), ex);

    try {

        servlet.service (req, resp);

        resp.complete ();

    } catch (ServletException e) {

        throw new IOException (e);

    }

}
