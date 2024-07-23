public static void main (String...argv) throws ClassNotFoundException {

    Class < Foo > fooClass = loadClass ();

    initializeClass (fooClass);

    URLClassLoader myClassLoader = ((URLClassLoader) InitializeClassMultipleTimes.class.getClassLoader ());

    URL [] urls = myClassLoader.getURLs ();

    for (int i = 0;

    i < 2; i ++) {

        URLClassLoader newClassLoader = new URLClassLoader (urls, null);

        System.out.format ("%nLoading class using another class loader%n", Foo.class.getSimpleName ());

        Class < ? > fooClassAgain = Class.forName (fooClass.getName (), false, newClassLoader);

        initializeClass (fooClassAgain);

    }

}