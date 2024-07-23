public static boolean contains (String a, String b) {

    boolean status = true;

    Map < String, Integer > mapA = new HashMap < > ();

    Map < String, Integer > mapB = new HashMap < > ();

    for (char X1 : a.toCharArray ()) {

        Integer val = mapA.get ("" + X1);

        if (val != null) {

            mapA.put ("" + X1, val + 1);

        } else {

            mapA.put ("" + X1, 1);

        }

    }

    for (char X1 : b.toCharArray ()) {

        Integer val = mapB.get ("" + X1);

        if (val != null) {

            mapB.put ("" + X1, val + 1);

        } else {

            mapB.put ("" + X1, 1);

        }

    }

    for (Map.Entry < String, Integer > entry : mapA.entrySet ()) {

        if (mapB.get (entry.getKey ()) == null || entry.getValue () > mapB.get (entry.getKey ())) {

            status = false;

        }

    }

    return status;

}
