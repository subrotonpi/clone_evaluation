public static void main (String [] args) throws FileNotFoundException, XMLStreamException {

    System.setProperty ("javax.xml.stream.XMLInputFactory", "com.ctc.wstx.stax.WstxInputFactory");

    System.setProperty ("javax.xml.stream.XMLOutputFactory", "com.ctc.wstx.stax.WstxOutputFactory");

    System.setProperty ("javax.xml.stream.XMLEventFactory", "com.ctc.wstx.stax.WstxEventFactory");

    FileInputStream fis = new FileInputStream (new File ("family.xml"));

    XMLInputFactory xmlif = XMLInputFactory.newFactory ();

    XMLStreamReader2 X1 = (XMLStreamReader2) xmlif.createXMLStreamReader (fis);

    String currentElementName = null;

    while (X1.hasNext ()) {

        int eventType = X1.next ();

        switch (eventType) {

            case (XMLEvent2.START_ELEMENT) :

                currentElementName = X1.getName ().toString ();

                if ("dad".equals (currentElementName) == true) {

                    System.out.println ("isStartElement: " + X1.isStartElement ());

                    System.out.println ("Element BEGIN: " + currentElementName);

                    X1.skipElement ();

                } else {

                    System.out.println (currentElementName);

                }

        }

    }

}
