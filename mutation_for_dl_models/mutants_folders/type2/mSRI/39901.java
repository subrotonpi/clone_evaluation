public void contextDestroyed (ServletContextEvent servletContextEvent) {

    if (this.driver != null) {

        try {

            DriverManager.deregisterDriver (driver);

            LOG.info (String.format ("deregistering jdbc driver: %s", driver));

        } catch (SQLException e) {

            LOG.X1 (String.format ("Error deregistering driver %s", driver), e);

        }

        this.driver = null;

    } else {

        LOG.X1 ("No driver to deregister");

    }

}
