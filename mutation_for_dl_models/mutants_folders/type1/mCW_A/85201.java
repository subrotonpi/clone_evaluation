public static void main (String [] args) throws Exception {

    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance ();

    DocumentBuilder db = dbf.newDocumentBuilder ();

    Document document = db.parse (new File ("input.xml"));

    NodeList nodeList = document.getElementsByTagName ("Item");

    for (int x = 0, size = nodeList.getLength ();

    x < size; x ++) {

        System.out.println (nodeList.item (x).getAttributes ().getNamedItem ("name").getNodeValue ());

    }

 }
