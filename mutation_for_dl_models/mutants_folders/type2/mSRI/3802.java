public static void shuffleArray (int [] X1) {

    List < Integer > list = new ArrayList < > ();

    for (int i : X1) {

        list.add (i);

    }

    Collections.shuffle (list);

    for (int i = 0;

    i < list.size (); i ++) {

        X1 [i] = list.get (i);

    }

}
