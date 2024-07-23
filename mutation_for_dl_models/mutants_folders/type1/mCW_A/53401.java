public static void main (String [] args) {

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance ();

    factory.setNamespaceAware (true);

    DocumentBuilder builder;

    Document doc = null; 

    try {

        builder = factory.newDocumentBuilder ();

        doc = builder.parse ("employees.xml");

        XPathFactory xpathFactory = XPathFactory.newInstance ();

        XPath xpath = xpathFactory.newXPath ();

        String name = getEmployeeNameById (doc, xpath, 4);

        System.out.println ("Employee Name with ID 4: " + name);

        List < String > names = getEmployeeNameWithAge (doc, xpath, 30);

        System.out.println ("Employees with 'age>30' are:" + Arrays.toString (names.toArray ()));

        List < String > femaleEmps = getFemaleEmployeesName (doc, xpath);

        System.out.println ("Female Employees names are:" + Arrays.toString (femaleEmps.toArray ()));

    } catch (ParserConfigurationException | SAXException | IOException e) {

        e.printStackTrace ();

    }

}
