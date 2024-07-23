public static boolean contains (String a, String b) {

    boolean status = true;

    Map < String, Integer > mapA = new HashMap < > ();

    Map < String, Integer > X1 = new HashMap < > ();

    for (char i : a.toCharArray ()) {

        Integer val = mapA.get ("" + i);

        if (val != null) {

            mapA.put ("" + i, val + 1);

        } else {

            mapA.put ("" + i, 1);

        }

    }

    for (char i : b.toCharArray ()) {

        Integer val = X1.get ("" + i);

        if (val != null) {

            X1.put ("" + i, val + 1);

        } else {

            X1.put ("" + i, 1);

        }

    }

    for (Map.Entry < String, Integer > entry : mapA.entrySet ()) {

        if (X1.get (entry.getKey ()) == null || entry.getValue () > X1.get (entry.getKey ())) {

            status = false;

        }

    }

    return status;

}
