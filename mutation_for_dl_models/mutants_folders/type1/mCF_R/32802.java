public static void close (Statement...statements) {

    for (Statement stmt : statements) {

        try {

            if (stmt != null) stmt.close ();

        } catch (SQLException se) {
         }

    }

}
