public static void main (String [] args) throws ParserConfigurationException, SAXException, IOException, VerifyError {

    SAXParserFactory saxDoc = SAXParserFactory.newInstance ();

    SAXParser saxParser = saxDoc.newSAXParser ();

    DefaultHandler handler = new DefaultHandler () {

        String tmpElementName = null;

        String tmpElementValue = null;

        @Override

        public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException {

            tmpElementValue = "";

            tmpElementName = qName;

            tmpAtrb = new HashMap ();

            for (int i = 0;

            i < attributes.getLength (); i ++) {

                String aname = attributes.getLocalName (i);

                String value = attributes.getValue (i);

                tmpAtrb.put (aname, value);

            }

        }@Override

        public void endElement (String uri, String localName, String qName) throws SAXException {

            if (tmpElementName.equals (qName)) {

                X1.out.println ("Element Name :" + tmpElementName);

                for (Map.Entry < String, String > entrySet : tmpAtrb.entrySet ()) {

                    X1.out.println ("Attribute Name :" + entrySet.getKey () + "Attribute Value :" + entrySet.getValue ());

                }

                X1.out.println ("Element Value :" + tmpElementValue);

                xmlVal.put (tmpElementName, tmpElementValue);

                X1.out.println (xmlVal);

                String getKeyValues = xmlVal.get (tmpElementName);

                X1.out.println ("XmlTag:" + tmpElementName + ":::::" + "ValueFetchedFromTheMap:" + getKeyValues);

            }

        }@Override

        public void characters (char ch [], int start, int length) throws SAXException {

            tmpElementValue = new String (ch, start, length);

        }}

    ;

    saxParser.parse (new File ("D:/Test _ XML/file.xml"), handler);

}
