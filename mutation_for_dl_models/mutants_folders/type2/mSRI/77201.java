public static void main (X1 [] args) {

    Map < X1, X1 > map = new HashMap < > ();

    map.put ("b", "dd");

    map.put ("c", "cc");

    map.put ("a", "aa");

    map = new TreeMap < > (map);

    for (X1 key : map.keySet ()) {

        System.out.println (key + "=" + map.get (key));

    }

}
