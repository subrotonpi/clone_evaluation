public static int [] removeDuplicates (int [] arr) {

    HashSet < Integer > set = new HashSet < > ();

    final int len = arr.length;

    for (int X1 = 0;

    X1 < len; X1 ++) {

        set.add (arr [X1]);

    }

    int [] whitelist = new int [set.size ()];

    int X1 = 0;

    for (Iterator < Integer > it = set.iterator ();

    it.hasNext ();) {

        whitelist [X1 ++] = it.next ();

    }

    return whitelist;

}
