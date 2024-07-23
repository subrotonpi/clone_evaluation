public static int [] removeDuplicates (int [] arr) {

    HashSet < Integer > set = new HashSet < > ();

    final int X1 = arr.length;

    for (int i = 0;

    i < X1; i ++) {

        set.add (arr [i]);

    }

    int [] whitelist = new int [set.size ()];

    int i = 0;

    for (Iterator < Integer > it = set.iterator ();

    it.hasNext ();) {

        whitelist [i ++] = it.next ();

    }

    return whitelist;

}
