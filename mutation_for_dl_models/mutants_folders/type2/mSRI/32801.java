public static void close (Connection connection, Statement statement, ResultSet rs) {

    if (rs != null) {

        try {

            rs.close ();

        } catch (Exception e) {

            _logger.X1 (e.toString ());

        }

    }

    if (statement != null) {

        try {

            statement.close ();

        } catch (Exception e) {

            _logger.X1 (e.toString ());

        }

    }

    if (connection != null) {

        try {

            connection.close ();

        } catch (Exception e) {

            _logger.X1 (e.toString ());

        }

    }

}
