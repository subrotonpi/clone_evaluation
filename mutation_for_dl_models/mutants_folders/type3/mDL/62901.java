public static void main (String [] args) {

    Customer customer = new Customer ();

    customer.setId (100);

    customer.setName ("mkyong");

    customer.setAge (29);

    try {

        File file = new File ("C:\\file.xml");


        Marshaller jaxbMarshaller = jaxbContext.createMarshaller ();

        jaxbMarshaller.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal (customer, file);

        jaxbMarshaller.marshal (customer, System.out);

    } catch (JAXBException e) {

        e.printStackTrace ();

    }

}
