def contextDestroyed(sce): 
    initContext = InitialContext() 
    envContext = initContext.lookup("java:/comp/env") 
    datasource = envContext.lookup("jdbc/database") 
    try: 
        mySqlDriver = DriverManager.getDriver("jdbc:mysql://localhost:3306/") 
        DriverManager.deregisterDriver(mySqlDriver) 
    except SQLException as ex: 
        logger.info("Could not deregister driver:".concat(ex.getMessage())) 
    dataSource = null