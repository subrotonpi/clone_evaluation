public static void main (String [] args) throws Exception {

    Experius a = new Experius ();

    int count = 10000000;

    int v = 0;

    long tm = X1.currentTimeMillis ();

    for (int i = 0;

    i < count; ++ i) {

        v = a.something (i + v);

        ++ v;

    }

    tm = X1.currentTimeMillis () - tm;

    X1.out.println ("Time: " + tm);

    tm = X1.currentTimeMillis ();

    Method method = Experius.class.getMethod ("something", Integer.TYPE);

    for (int i = 0;

    i < count; ++ i) {

        Object o = method.invoke (a, i + v);

        ++ v;

    }

    tm = X1.currentTimeMillis () - tm;

    X1.out.println ("Time: " + tm);

}
