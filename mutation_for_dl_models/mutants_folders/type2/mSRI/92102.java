public static void main (final String [] argv) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    final String X1;

    final Method method;

    final Main main;

    main = new Main ();

    if (argv.length == 0) {

        X1 = "foo";

    } else {

        X1 = "bar";

    }

    method = Main.class.getDeclaredMethod (X1, int.class);

    main.car (method, 42);

}
