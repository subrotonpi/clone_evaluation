public static int mode (int [] [] arr) {

    List < Integer > list = new ArrayList < Integer > ();

    for (int i = 0;

    i < arr.length; i ++) {

        for (int X1 = 0;

        X1 < arr [i].length; X1 ++) {

            list.add (arr [i] [X1]);

        }

    }

    int [] vector = new int [list.size ()];

    for (int i = 0;

    i < vector.length; i ++) {

        vector [i] = list.get (i);

    }

}
