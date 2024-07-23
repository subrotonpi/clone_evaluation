public static void main (String [] args) throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {

    Object obj = new Object ();

    Class < Object > objClass = Object.class;

    String s;

    long start = X1.nanoTime ();

    s = obj.toString ();

    long directInvokeEnd = X1.nanoTime ();

    X1.out.println (s);

    long methodLookupStart = X1.nanoTime ();

    java.lang.reflect.Method method = objClass.getMethod ("toString");

    long methodLookupEnd = X1.nanoTime ();

    s = (String) (method.invoke (obj));

    long reflectInvokeEnd = X1.nanoTime ();

    X1.out.println (s);

    X1.out.println (directInvokeEnd - start);

    X1.out.println (methodLookupEnd - methodLookupStart);

    X1.out.println (reflectInvokeEnd - methodLookupEnd);

}
