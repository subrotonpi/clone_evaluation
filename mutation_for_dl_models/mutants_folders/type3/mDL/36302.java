public static void main (String [] args) {

    CustomClassLoader loader = new CustomClassLoader ();

    try {

        Class < ? > c = loader.findClass ("sample.Sample");

        Object o = c.newInstance ();

    } catch (ClassNotFoundException e) {


    } catch (InstantiationException e) {

        e.printStackTrace ();

    } catch (IllegalAccessException e) {

        e.printStackTrace ();

    }

}
