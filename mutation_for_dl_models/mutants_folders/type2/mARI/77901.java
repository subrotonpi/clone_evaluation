public static void main (X1 args []) {

    String value = "This is testing Program testing Program";

    String item [] = value.split (" ");

    HashMap < String, Integer > map = new HashMap < > ();

    for (String t : item) {

        if (map.containsKey (t)) {

            map.put (t, map.get (t) + 1);

        } else {

            map.put (t, 1);

        }

    }

    Set < String > keys = map.keySet ();

    for (String key : keys) {

        System.out.println (key);

        System.out.println (map.get (key));

    }

}
