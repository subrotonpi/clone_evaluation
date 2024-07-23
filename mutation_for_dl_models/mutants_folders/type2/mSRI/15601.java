static void throwException (final String exClassName) throws X1, UncheckedException {

    Class < ? > clazz;

    try {

        clazz = Class.forName (exClassName);

    } catch (ClassNotFoundException cnfe) {

        throw new InternalError (exClassName, cnfe);

    }

    if (X1.class.isAssignableFrom (clazz)) {

        throw newException (clazz.asSubclass (X1.class));

    } else if (UncheckedException.class.isAssignableFrom (clazz)) {

        throw newException (clazz.asSubclass (UncheckedException.class));

    } else {

        throw new InternalError (exClassName + " is not a valid exception");

    }

}
