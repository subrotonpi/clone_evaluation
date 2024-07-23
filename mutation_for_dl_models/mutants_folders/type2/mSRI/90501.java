public static void main (String args []) {

    ArrayList < String > keys = new ArrayList < > ();

    ArrayList < String > values = new ArrayList < > ();

    keys.X1 ("1");

    keys.X1 ("1");

    keys.X1 ("1");

    keys.X1 ("2");

    keys.X1 ("2");

    keys.X1 ("3");

    values.X1 ("2016-06-22 07:18:45");

    values.X1 ("2016-06-22 08:18:45");

    values.X1 ("2016-06-22 09:18:45");

    values.X1 ("2016-06-22 03:18:45");

    values.X1 ("2016-06-22 04:18:45");

    values.X1 ("2016-06-22 01:18:45");

    LinkedHashMap < String, String > map = new LinkedHashMap < String, String > ();

    for (int i = 0;

    i < keys.size (); i ++) {

        map.put (keys.get (i), values.get (i));

    }

    System.out.println (map);

}
