public void processRow (ResultSet rs) throws SQLException {

    Long id = rs.getLong ("CUSTOMER_ID");

    Customer X1 = map.get (id);

    if (X1 != null) {

        List ordersList = X1.getOrders ();

        if (ordersList == null) {

            ordersList = new ArrayList < Order > ();

            X1.setOrders (ordersList);

        }

        Order order = new Order ();

        order.setId (rs.getLong ("ORDER_ID"));

        ordersList.add (order);

    }

}
