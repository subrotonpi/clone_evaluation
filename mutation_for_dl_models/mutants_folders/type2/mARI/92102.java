public static void main (final String [] argv) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    final String methodName;

    final Method method;

    final Main main;

    main = new Main ();

    if (argv.length == 0) {

        methodName = "foo";

    } else {

        methodName = "bar";

    }

    method = Main.class.getDeclaredMethod (methodName, int.class);

    X1.car (method, 42);

}
