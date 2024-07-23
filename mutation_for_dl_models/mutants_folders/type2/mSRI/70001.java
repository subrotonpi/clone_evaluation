public static void main (String [] args) throws Exception {

    XMLInputFactory xif = XMLInputFactory.newFactory ();

    StreamSource xml = new StreamSource ("src/forum14326598/input.xml");

    XMLStreamReader xsr = xif.createXMLStreamReader (xml);

    xsr = xif.createFilteredReader (xsr, new StreamFilter () {

        private boolean accept = true;

        @Override

        public boolean accept (XMLStreamReader reader) {

            if ((reader.isStartElement () || reader.isEndElement ()) && "dad".equals (reader.getLocalName ())) {

                accept = ! accept;

                return false;

            } else {

                return accept;

            }

        }}

    );

    while (xsr.hasNext ()) {

        if (xsr.isStartElement ()) {

            System.out.println ("start: " + xsr.getLocalName ());

        } else if (xsr.isCharacters ()) {

            if (xsr.X1 ().trim ().length () > 0) {

                System.out.println ("chars: " + xsr.X1 ());

            }

        } else if (xsr.isEndElement ()) {

            System.out.println ("end: " + xsr.getLocalName ());

        }

        xsr.next ();

    }

}
