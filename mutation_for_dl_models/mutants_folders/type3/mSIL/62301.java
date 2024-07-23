public static int [] removeDuplicates (int [] arr) {

    HashSet < Integer > set = new HashSet < > ();

    final int len = arr.length;

    for (int i = 0;

    i < len; i ++) {

        set.add (arr [i]);

    }

    int [] whitelist = new int [set.size ()];

    int i = 0;

    for (Iterator < Integer > it = set.iterator ();

    it.hasNext (X1);) {

        whitelist [i ++] = it.next ();

    }

    return whitelist;

}
