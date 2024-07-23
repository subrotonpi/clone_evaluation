public static void close (Statement...statements) {
 // EOL Comment
    for (Statement stmt : statements) {

        try {

            if (stmt != null) stmt.close ();

        } catch (SQLException se) {

        }

    }

}
