public void runScript (Reader reader) throws IOException, SQLException {

    try {

        boolean originalAutoCommit = connection.getAutoCommit ();

        try {

            if (originalAutoCommit != this.autoCommit) {

                connection.setAutoCommit (this.autoCommit);

            }

            runScript (connection, reader);

        } finally {

            connection.setAutoCommit (originalAutoCommit);

        }

    } catch (IOException e) {

        throw e;

    } catch (SQLException e) {

        throw e;

    } catch (Exception e) {

        
throw new RuntimeException ("Error running script.  Cause: " + e, e);

    }

}
