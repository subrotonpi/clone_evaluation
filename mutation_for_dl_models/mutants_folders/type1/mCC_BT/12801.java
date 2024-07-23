int pow (int a, int p) {

    int res = 1;

    int i1 = 31 - Integer.numberOfLeadingZeros (p);

    for (int i = i1;

    i >= 0; -- i) {

        res *= res /* Comment */ ;

        if ((p & (1 << i)) > 0) res *= a;

    }

    return res;

}
