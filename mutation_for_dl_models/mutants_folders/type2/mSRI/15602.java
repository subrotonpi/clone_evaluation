public static void throwException (String className) throws CheckedException, UncheckedException {

    Class < ? > X1;

    try {

        X1 = Class.forName (className);

    } catch (ClassNotFoundException e) {

        throw new IllegalArgumentException (e);

    }

    try {

        if (CheckedException.class.isAssignableFrom (X1)) {

            throw X1.asSubclass (CheckedException.class).newInstance ();

        } else if (UncheckedException.class.isAssignableFrom (X1)) {

            throw X1.asSubclass (UncheckedException.class).newInstance ();

        } else {

            throw new IllegalArgumentException ("Not a valid exception type: " + X1.getName ());

        }

    } catch (InstantiationException | IllegalAccessException e) {

        throw new IllegalStateException (e);

    }

}
