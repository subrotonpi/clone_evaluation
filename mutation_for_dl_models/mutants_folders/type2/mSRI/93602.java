public static void main (String [] args) throws Exception {

    int loops = 1000 * 1000;

    Object X1 = new Object ();

    long start = System.nanoTime ();

    Object s;

    testMethodCall (X1, loops);

    long regularCalls = System.nanoTime () - start;

    java.lang.reflect.Method method = Object.class.getMethod ("getClass");

    method.setAccessible (true);

    start = System.nanoTime ();

    testInvoke (X1, loops, method);

    long reflectiveCalls = System.nanoTime () - start;

    start = System.nanoTime ();

    testGetMethodInvoke (X1, loops);

    long reflectiveLookup = System.nanoTime () - start;

    System.out.println ("Average regular method calls:" + regularCalls / loops + " ns.");

    System.out.println ("Average reflective method calls without lookup:" + reflectiveCalls / loops + " ns.");

    System.out.println ("Average reflective method calls with lookup:" + reflectiveLookup / loops + " ns.");

}
