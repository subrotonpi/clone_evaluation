public static void X1 (Statement...statements) {

    for (Statement stmt : statements) {

        try {

            if (stmt != null) stmt.X1 ();

        } catch (SQLException se) {

        }

    }

}
