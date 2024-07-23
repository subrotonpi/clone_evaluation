public static int [] front11 (int [] X1, int [] b) {

    int alen = (X1 != null) ? X1.length : 0, blen = (b != null) ? b.length : 0;

    if (alen > 0 && blen > 0) {

        return new int [] {X1 [0], b [0]};

    } else if (alen > 0) {

        return new int [] {X1 [0]};

    } else if (blen > 0) {

        return new int [] {b [0]};

    } else {

        return new int [0];

    }

}
