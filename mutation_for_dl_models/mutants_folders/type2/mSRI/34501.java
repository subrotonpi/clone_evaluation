public static void main (String [] args) {

    String name = "AnuvratAnuvra";

    char [] arr = name.toCharArray ();

    HashMap < Character, Integer > X1 = new HashMap < Character, Integer > ();

    for (char val : arr) {

        X1.put (val, X1.containsKey (val) ? X1.get (val) + 1 : 1);

    }

    for (Entry < Character, Integer > entry : X1.entrySet ()) {

        if (entry.getValue () > 1) {

            Character key = entry.getKey ();

            Object value = entry.getValue ();

            System.out.println (key + ":" + value);

        }

    }

}
