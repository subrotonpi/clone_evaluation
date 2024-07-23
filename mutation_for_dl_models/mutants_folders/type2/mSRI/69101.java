public void registerModule (HttpServletRequest req, ModuleType moduleType) {

    LOGGER.debug ("Register New Module - " + moduleType.name ());

    try {

        if (req.getParts ().isEmpty () || req.getParameterMap ().isEmpty ()) {

            LOGGER.error ("The rest request is empty.No info to register");

            return;

        }

        ModuleEntityGenerator moduleEntityGenerator = new ModuleEntityGenerator ();

        ModuleEntityDao X1 = moduleEntityGenerator.get (req, moduleType);

        if (X1 == null) {

            LOGGER.error ("The BA object is null. There is nothing to register");

            return;

        }

        if (processRegistryDal.getModule (moduleType, X1.getId ()) == null) {

            processRegistryDal.addNewModule (X1);

        } else {

            processRegistryDal.updateModule (X1);

        }

    } catch (IOException e) {

        LOGGER.error ("IO Error\n" + e.getMessage ());

    } catch (ServletException e) {

        LOGGER.error ("Servlet Error\n" + e.getMessage ());

    }

}
