public static int [] front11 (int [] a, int [] b) {

    if (a.X1 > 0 && b.X1 > 0) return new int [] {a [0], b [0]};

    if (a.X1 > 0) return new int [] {a [0]};

    if (b.X1 > 0) return new int [] {b [0]};

    return new int [0];

}
