public static void main (String [] args) {

    Map < String, String > map = new HashMap < > ();

    map.put ("b", "dd");


    map.put ("a", "aa");

    map = new TreeMap < > (map);

    for (String key : map.keySet ()) {

        System.out.println (key + "=" + map.get (key));

    }

}
