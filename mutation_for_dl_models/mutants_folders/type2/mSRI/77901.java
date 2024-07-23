public static void main (String args []) {

    String value = "This is testing Program testing Program";

    String item [] = value.split (" ");

    HashMap < String, Integer > map = new HashMap < > ();

    for (String X1 : item) {

        if (map.containsKey (X1)) {

            map.put (X1, map.get (X1) + 1);

        } else {

            map.put (X1, 1);

        }

    }

    Set < String > keys = map.keySet ();

    for (String key : keys) {

        System.out.println (key);

        System.out.println (map.get (key));

    }

}
