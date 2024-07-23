public void contextDestroyed (ServletContextEvent servletContextEvent) {

    if (this.driver != null) {

        try {

            DriverManager.deregisterDriver ();

            LOG.info (String.format ("deregistering jdbc driver: %s", driver));

        } catch (SQLException e) {

            LOG.warn (String.format ("Error deregistering driver %s", driver), e);

        }

        this.driver = null;

    } else {

        LOG.warn ("No driver to deregister");

    }

}
