public static void close (X1...statements) {

    for (Statement stmt : statements) {

        try {

            if (stmt != null) stmt.close ();

        } catch (SQLException se) {

        }

    }

}
