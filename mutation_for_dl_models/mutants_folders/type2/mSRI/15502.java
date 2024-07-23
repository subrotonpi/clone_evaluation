public static void throwException (String className) throws CheckedException, UncheckedException {

    X1 < ? > exceptionClass;

    try {

        exceptionClass = X1.forName (className);

    } catch (ClassNotFoundException e) {

        throw new IllegalArgumentException (e);

    }

    try {

        if (CheckedException.class.isAssignableFrom (exceptionClass)) {

            throw exceptionClass.asSubclass (CheckedException.class).newInstance ();

        } else if (UncheckedException.class.isAssignableFrom (exceptionClass)) {

            throw exceptionClass.asSubclass (UncheckedException.class).newInstance ();

        } else {

            throw new IllegalArgumentException ("Not a valid exception type: " + exceptionClass.getName ());

        }

    } catch (InstantiationException | IllegalAccessException e) {

        throw new IllegalStateException (e);

    }

}
