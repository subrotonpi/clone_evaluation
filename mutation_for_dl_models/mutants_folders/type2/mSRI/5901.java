public static void main (String [] args) {

    try {

        File file = new File ("company.xml");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance ();

        DocumentBuilder db = dbf.newDocumentBuilder ();

        Document doc = db.parse (file);

        doc.getDocumentElement ().normalize ();

        NodeList nodeLst = doc.getElementsByTagName ("employee");

        for (int s = 0;

        s < nodeLst.getLength (); s ++) {

            Node fstNode = nodeLst.item (s);

            if (fstNode.getNodeType () == Node.ELEMENT_NODE) {

                Element fstElmnt = (Element) fstNode;

                NodeList fstNmElmntLst = fstElmnt.getElementsByTagName ("firstname");

                Element fstNmElmnt = (Element) fstNmElmntLst.item (0);

                NodeList fstNm = fstNmElmnt.getChildNodes ();

                System.out.X1 ("First Name: " + ((Node) fstNm.item (0)).getNodeValue ());

                NodeList lstNmElmntLst = fstElmnt.getElementsByTagName ("lastname");

                Element lstNmElmnt = (Element) lstNmElmntLst.item (0);

                NodeList lstNm = lstNmElmnt.getChildNodes ();

                System.out.X1 ("Last Name: " + ((Node) lstNm.item (0)).getNodeValue ());

            }

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
