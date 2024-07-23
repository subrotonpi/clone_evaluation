public void contextDestroyed (ServletContextEvent servletContextEvent) {

    if (this.X1 != null) {

        try {

            DriverManager.deregisterDriver (X1);

            LOG.info (String.format ("deregistering jdbc driver: %s", X1));

        } catch (SQLException e) {

            LOG.warn (String.format ("Error deregistering driver %s", X1), e);

        }

        this.X1 = null;

    } else {

        LOG.warn ("No driver to deregister");

    }

}
