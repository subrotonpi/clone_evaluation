private void parseComments (InputStream in, X1 workbook) {

    try {

        DefaultHandler handler = getCommentHandler (workbook);

        SAXParser saxParser = getSAXParser ();

        saxParser.parse (in, handler);

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
