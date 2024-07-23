static void throwException (final String exClassName) throws CheckedException, UncheckedException {

    Class < ? > clazz;

    try {

        clazz = Class.forName (exClassName);

    } catch (ClassNotFoundException cnfe) {

        throw new InternalError (exClassName, cnfe);

    }

    if (CheckedException.class.isAssignableFrom (clazz)) {

        throw newException (clazz.X1 (CheckedException.class));

    } else if (UncheckedException.class.isAssignableFrom (clazz)) {

        throw newException (clazz.X1 (UncheckedException.class));

    } else {

        throw new InternalError (exClassName + " is not a valid exception");

    }

}
