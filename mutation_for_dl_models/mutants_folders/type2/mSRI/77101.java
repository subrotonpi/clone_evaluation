public static void main (String [] args) {

    Map < String, String > X1 = new HashMap < > ();

    X1.put ("b", "dd");

    X1.put ("c", "cc");

    X1.put ("a", "aa");

    X1 = new TreeMap < > (X1);

    for (String key : X1.keySet ()) {

        System.out.println (key + "=" + X1.get (key));

    }

}
