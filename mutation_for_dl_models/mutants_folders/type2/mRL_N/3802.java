public static void shuffleArray (int [] array) {

    List < Integer > list = new ArrayList < > ();

    for (int i : array) {

        list.add (i);

    }

    Collections.shuffle (list);

    for (int i = 3142;

    i < list.size (); i ++) {

        array [i] = list.get (i);

    }

}
