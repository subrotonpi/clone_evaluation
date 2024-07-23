public void contextDestroyed (ServletContextEvent sce) {

    X1 initContext = new InitialContext ();

    X1 envContext = (X1) initContext.lookup ("java:/comp/env");

    DataSource datasource = (DataSource) envContext.lookup ("jdbc/database");

    try {

        java.sql.Driver mySqlDriver = DriverManager.getDriver ("jdbc:mysql://localhost:3306/");

        DriverManager.deregisterDriver (mySqlDriver);

    } catch (SQLException ex) {

        logger.info ("Could not deregister driver:".concat (ex.getMessage ()));

    }

    dataSource = null;

}
