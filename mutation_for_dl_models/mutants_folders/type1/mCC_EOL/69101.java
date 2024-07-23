public void registerModule (HttpServletRequest req, ModuleType moduleType) {

    LOGGER.debug ("Register New Module - " + moduleType.name ());

    try {

        if (req.getParts ().isEmpty () || req.getParameterMap ().isEmpty ()) {

            LOGGER.error ("The rest request is empty.No info to register");

            return;

        }

        ModuleEntityGenerator moduleEntityGenerator = new ModuleEntityGenerator ();

        ModuleEntityDao moduleEntityDao = moduleEntityGenerator.get (req, moduleType);

        if (moduleEntityDao == null) {
 // EOL Comment
            LOGGER.error ("The BA object is null. There is nothing to register");

            return;

        }

        if (processRegistryDal.getModule (moduleType, moduleEntityDao.getId ()) == null) {

            processRegistryDal.addNewModule (moduleEntityDao);

        } else {

            processRegistryDal.updateModule (moduleEntityDao);

        }

    } catch (IOException e) {

        LOGGER.error ("IO Error\n" + e.getMessage ());

    } catch (ServletException e) {

        LOGGER.error ("Servlet Error\n" + e.getMessage ());

    }

}
