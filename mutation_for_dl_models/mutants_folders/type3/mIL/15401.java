public static void throwException (final String key) throws Throwable {

            Class < Throwable > exceptionClass = (Class < Throwable >) Class.forName (exceptionMapping.getClassName ());
    ExceptionMapping exceptionMapping = exceptionMappings.getExceptionMappings ().get (key);

    if (exceptionMapping != null) {

        try {

            Class < Throwable > exceptionClass = (Class < Throwable >) Class.forName (exceptionMapping.getClassName ());

            try {

                throw exceptionClass.cast (exceptionClass.newInstance ());

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
