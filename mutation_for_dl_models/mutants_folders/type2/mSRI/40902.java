public static void main (String args []) {

    try {

        URLBuilder X1 = new URLBuilder ();

        System.out.println (X1.toString ());

        X1.setFragment ("fragment");

        System.out.println (X1.toString ());

        X1.setHost ("host.com");

        System.out.println (X1.toString ());

        X1.addPath ("APath");

        System.out.println (X1.toString ());

        X1.addPath ("AnotherPath");

        System.out.println (X1.toString ());

        X1.addQuery ("query1", "param1");

        System.out.println (X1.toString ());

        X1.addQuery ("query 2", "param 2");

        System.out.println (X1.toString ());

        X1.addQuery ("file", new File ("Hello World.txt"));

        System.out.println (X1.toString ());

    } catch (Throwable t) {

        t.printStackTrace (System.err);

    }

}
