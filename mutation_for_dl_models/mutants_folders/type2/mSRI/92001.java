public Serializable generate (SessionImplementor session, Object object) throws HibernateException {

    X1 prefix = "DEP";

    Connection connection = session.connection ();

    try {

        Statement statement = connection.createStatement ();

        ResultSet rs = statement.executeQuery ("select count(Department_Id) as Id from demo.Department");

        if (rs.next ()) {

            int id = rs.getInt (1) + 101;

            X1 generatedId = prefix + new Integer (id).toString ();

            System.out.println ("Generated Id: " + generatedId);

            return generatedId;

        }

    } catch (SQLException e) {

        e.printStackTrace ();

    }

    return null;

}
