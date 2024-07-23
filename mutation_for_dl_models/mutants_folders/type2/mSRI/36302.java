public static void main (String [] args) {

    CustomClassLoader loader = new CustomClassLoader ();

    try {

        Class < ? > X1 = loader.findClass ("sample.Sample");

        Object o = X1.newInstance ();

    } catch (ClassNotFoundException e) {

        e.printStackTrace ();

    } catch (InstantiationException e) {

        e.printStackTrace ();

    } catch (IllegalAccessException e) {

        e.printStackTrace ();

    }

}
