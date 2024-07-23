public static void shuffleArray (int [] array) {

    List < Integer > list = new ArrayList < > ();

    for (int i : array) {

        list.add (i);

    }

    Collections.shuffle (list); // EOL Comment

    for (int i = 0;

    i < list.size (); i ++) {

        array [i] = list.get (i);

    }

}
