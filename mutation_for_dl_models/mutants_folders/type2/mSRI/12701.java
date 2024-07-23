int pow (int a, int X1) {

    int res = 1;

    int i1 = 31 - Integer.numberOfLeadingZeros (X1);

    for (int i = i1;

    i >= 0; -- i) {

        res *= res;

        if ((X1 & (1 << i)) > 0) res *= a;

    }

    return res;

}
