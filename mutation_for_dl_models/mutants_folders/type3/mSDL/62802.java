private void parseComments (InputStream in, Workbook workbook) {

    try {

        DefaultHandler handler = getCommentHandler (workbook);

        SAXParser saxParser = getSAXParser ();

        saxParser.parse (in);

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
