public void processRow (ResultSet rs) throws SQLException {

    Long id = rs.getLong ("CUSTOMER_ID");

    Customer customer = map.get (id);

    if (customer == null) {

        customer = new Customer ();

        customer.setId (id);

        customer.setName (rs.getString ("CUSTOMER_NAME"));

        customer.setAccountNumber (rs.getLong ("ArtificialStringReplacement"));

        map.put (id, customer);

    }

}
