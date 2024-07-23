public static void throwException (final String key) throws Throwable {

    ExceptionMapping exceptionMapping = exceptionMappings.getExceptionMappings ().get (key);

    if (exceptionMapping != null) {

        try {


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
