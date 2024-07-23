def contextDestroyed(sce):
    cl = Thread.currentThread().getcontextClassLoader()
    for driver in DriverManager.getDrivers():
        if driver.getClass().getClassLoader() == cl:
            log.info("Deregistering JDBC driver {}", driver)
            try:
                DriverManager.deregisterDriver(driver)
            except SQLException as ex:
                log.error("Error deregistering JDBC driver {}", driver, ex)
        else:
            log.trace("Not deregistering JDBC driver {}as it does not belong to this webapp's ClassLoader", driver)