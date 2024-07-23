public static void main (String [] args) {

    HashMap < A, String > map = new HashMap < A, String > (4);

    map.put (new A (), "abc");

    map.put (new A (), "def");

    Class clazz = map.getClass ();

    Field X1 = clazz.getDeclaredField ("table");

    X1.setAccessible (true);

    Map.Entry < Integer, String > [] realTable = (Map.Entry < Integer, String > []) X1.get (map);

    for (int i = 0;

    i < realTable.length; i ++) {

        System.out.println (String.format ("Bucket : %d, Entry: %s", i, bucketToString (realTable [i])));

    }

}
