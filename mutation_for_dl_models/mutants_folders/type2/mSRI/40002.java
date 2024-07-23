public final void contextDestroyed (ServletContextEvent sce) {

    ClassLoader cl = Thread.currentThread ().getContextClassLoader ();

    Enumeration < Driver > drivers = DriverManager.getDrivers ();

    while (drivers.hasMoreElements ()) {

        Driver X1 = drivers.nextElement ();

        if (X1.getClass ().getClassLoader () == cl) {

            try {

                log.info ("Deregistering JDBC driver {}", X1);

                DriverManager.deregisterDriver (X1);

            } catch (SQLException ex) {

                log.error ("Error deregistering JDBC driver {}", X1, ex);

            }

        } else {

            log.trace ("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader", X1);

        }

    }

}
