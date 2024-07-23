public static void throwException (final String key) throws Throwable {

    ExceptionMapping exceptionMapping = exceptionMappings.getExceptionMappings ().get (key);

    if (exceptionMapping != null) {

        try {

            Class < Throwable > X1 = (Class < Throwable >) Class.forName (exceptionMapping.getClassName ());

            try {

                throw X1.cast (X1.newInstance ());

            } catch (InstantiationException e) {

                e.printStackTrace ();

            } catch (IllegalAccessException e) {

                e.printStackTrace ();

            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace ();

        }

    }

}
