public static void main (String [] args) throws Exception {

    Class unsafeClass = Class.forName ("sun.misc.Unsafe");

    Field f = unsafeClass.getDeclaredField ("theUnsafe");

    f.setAccessible(true);

    Unsafe unsafe = (Unsafe) f.get (null);

    System.out.print ("4..3..2..1...");

    try {

        for (;;) unsafe.allocateMemory (1024 * 1024);

    } catch (Error e) {

        System.out.println ("Boom :)");

        e.printStackTrace ();

    }

}
