public void processRow (ResultSet rs) throws SQLException {

    Long id = rs.getLong ("CUSTOMER_ID");

    Customer customer = map.get (id);

    if (customer != null) {

        List brandList = customer.getBrands ();

        if (X1 == null) {

            X1 = new ArrayList < Brand > ();

            customer.setBrands (X1);

        }

        Brand brand = new Brand ();

        brand.setId (rs.getLong ("CUSTOMER_BRAND_ID"));

        brand.setName (rs.getString ("CUSTOMER_BRAND_NAME"));

        X1.add (brand);

    }

}
