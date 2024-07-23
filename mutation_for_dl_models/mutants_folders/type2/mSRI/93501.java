public static void main (String [] args) throws Exception {

    Experius X1 = new Experius ();

    int count = 10000000;

    int v = 0;

    long tm = System.currentTimeMillis ();

    for (int i = 0;

    i < count; ++ i) {

        v = X1.something (i + v);

        ++ v;

    }

    tm = System.currentTimeMillis () - tm;

    System.out.println ("Time: " + tm);

    tm = System.currentTimeMillis ();

    Method method = Experius.class.getMethod ("something", Integer.TYPE);

    for (int i = 0;

    i < count; ++ i) {

        Object o = method.invoke (X1, i + v);

        ++ v;

    }

    tm = System.currentTimeMillis () - tm;

    System.out.println ("Time: " + tm);

}
