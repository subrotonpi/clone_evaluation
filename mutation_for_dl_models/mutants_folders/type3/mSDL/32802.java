public static void close () {

    for (Statement stmt : statements) {

        try {

            if (stmt != null) stmt.close ();

        } catch (SQLException se) {

        }

    }

}
