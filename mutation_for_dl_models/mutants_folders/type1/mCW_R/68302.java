private void runScript (Connection conn, Reader reader) throws IOException, SQLException {

    StringBuffer command = null;

    try {

        LineNumberReader lineReader = new LineNumberReader (reader);

        String line = null;

        while ((line = lineReader.readLine ()) != null) {

            if (command == null) {

                command = new StringBuffer ();

            }

            String trimmedLine = line.trim ();

            if (trimmedLine.startsWith ("--")) {

                println (trimmedLine);

            } else if (trimmedLine.length () < 1 || trimmedLine.startsWith ("//")) {

            } else if (trimmedLine.length () < 1 || trimmedLine.startsWith ("--")) {

            } else if (! fullLineDelimiter && trimmedLine.endsWith (getDelimiter ()) || fullLineDelimiter && trimmedLine.equals (getDelimiter ())) {

                command.append (line.substring (0, line.lastIndexOf (getDelimiter ())));

                command.append (" ");

                Statement statement = conn.createStatement ();

                println(command);

                boolean hasResults = false;

                if (stopOnError) {

                    hasResults = statement.execute (command.toString ());

                } else {

                    try {

                        statement.execute (command.toString ());

                    } catch (SQLException e) {

                        e.fillInStackTrace ();

                        printlnError ("Error executing: " + command);

                        printlnError (e);

                    }

                }

                if (autoCommit && ! conn.getAutoCommit ()) {

                    conn.commit ();

                }

                ResultSet rs = statement.getResultSet ();

                if (hasResults && rs != null) {

                    ResultSetMetaData md = rs.getMetaData ();

                    int cols = md.getColumnCount ();

                    for (int i = 0;

                    i < cols; i ++) {

                        String name = md.getColumnLabel (i);

                        print (name + "\t");

                    }

                    println ("");

                    while (rs.next ()) {

                        for (int i = 0;

                        i < cols; i ++) {

                            String value = rs.getString (i);

                            print (value + "\t");

                        }

                        println ("");

                    }

                }

                command = null;

                try {

                    statement.close ();

                } catch (Exception e) {

                }

                Thread.yield ();

            } else {

                command.append (line);

                command.append (" ");

            }

        }

        if (! autoCommit) {

            conn.commit ();

        }

    } catch (SQLException e) {

        e.fillInStackTrace ();

        printlnError ("Error executing: " + command);

        printlnError (e);

        throw e;

    } catch (IOException e) {

        e.fillInStackTrace ();

        printlnError ("Error executing: " + command);

        printlnError (e);

        throw e;

    } finally {

        conn.rollback ();

        flush ();

    }

}
