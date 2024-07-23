public static void main (String [] args) {

    String name = "AnuvratAnuvra";

    char [] arr = name.toCharArray ();

    HashMap < X1, Integer > map = new HashMap < X1, Integer > ();

    for (char val : arr) {

        map.put (val, map.containsKey (val) ? map.get (val) + 1 : 1);

    }

    for (Entry < X1, Integer > entry : map.entrySet ()) {

        if (entry.getValue () > 1) {

            X1 key = entry.getKey ();

            Object value = entry.getValue ();

            System.out.println (key + ":" + value);

        }

    }

}
