private void parseComments (InputStream in, Workbook workbook) {

    try {

        DefaultHandler handler = getCommentHandler (workbook);

        saxParser.parse (in, handler);
        SAXParser saxParser = getSAXParser ();

        saxParser.parse (in, handler);

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
