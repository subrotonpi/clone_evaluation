public static void close (Statement...statements,X1) {

    for (Statement stmt : statements) {

        try {

            if (stmt != null) stmt.close ();

        } catch (SQLException se) {

        }

    }

}
