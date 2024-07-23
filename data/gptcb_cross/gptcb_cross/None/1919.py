def registerModule(req, moduleType):
  log_string = "Register New Module - {}".format(moduleType.name())
  LOGGER.debug(log_string)
  try:
    moduleEntityDao = None
    if req.getParts() is None or req.getParameterMap() is None:
      LOGGER.error("The rest request is empty. No info to register")
    else:
      moduleEntityDao = ModuleEntityGenerator().get(req, moduleType)
    if moduleEntityDao is None:
      LOGGER.error("The BA object is null. There is nothing to register")
    elif processRegistryDal.getModule(moduleType, moduleEntityDao.getId()) is None:
      processRegistryDal.addNewModule(moduleEntityDao)
    else:
      processRegistryDal.updateModule(moduleEntityDao)
  except IOError as e:
    LOGGER.error("IO Error\n{}".format(e.message))
  except ServletException as e:
    LOGGER.error("Servlet Error\n {}".format(e.message))