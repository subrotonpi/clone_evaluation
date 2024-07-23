public Serializable generate (SessionImplementor session, Object object) throws HibernateException {

    String prefix = "DEP";

    Connection connection = session.connection ();

    try {

        Statement statement = connection.createStatement ();

        ResultSet rs = statement.executeQuery ("ArtificialStringReplacement");

        if (rs.next ()) {

            int id = rs.getInt (1) + 101;

            String generatedId = prefix + new Integer (id).toString ();

            System.out.println ("Generated Id: " + generatedId);

            return generatedId;

        }

    } catch (SQLException e) {

        e.printStackTrace ();

    }

    return null;

}
