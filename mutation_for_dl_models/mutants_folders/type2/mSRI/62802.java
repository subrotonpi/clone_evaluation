private void parseComments (InputStream in, Workbook X1) {

    try {

        DefaultHandler handler = getCommentHandler (X1);

        SAXParser saxParser = getSAXParser ();

        saxParser.parse (in, handler);

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
