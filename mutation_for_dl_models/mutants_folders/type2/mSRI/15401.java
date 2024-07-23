public static void throwException (final String key) throws Throwable {

    ExceptionMapping exceptionMapping = exceptionMappings.getExceptionMappings ().get (key);

    if (exceptionMapping != null) {

        try {

            Class < Throwable > exceptionClass = (Class < Throwable >) Class.forName (exceptionMapping.getClassName ());

            try {

                throw exceptionClass.cast (exceptionClass.newInstance ());

            } catch (InstantiationException X1) {

                X1.printStackTrace ();

            } catch (IllegalAccessException X1) {

                X1.printStackTrace ();

            }

        } catch (ClassNotFoundException X1) {

            X1.printStackTrace ();

        }

    }

}
