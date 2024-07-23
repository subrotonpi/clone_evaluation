def contextDestroyed(self, sce): 
    cl = threading.currentThread().getContextClassLoader()
    drivers = driverManager.getDrivers()
    while drivers.hasMoreElements():
        driver = drivers.nextElement()
        if (driver.getClass().getClassLoader() == cl):
            try:
                log.info("Deregistering JDBC driver {}".format(driver))
                driverManager.deregisterDriver(driver)
            except SQLException as ex:
                log.error("Error deregistering JDBC driver {}".format(ex.driver), ex)
        else:
            log.trace("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader".format(driver))