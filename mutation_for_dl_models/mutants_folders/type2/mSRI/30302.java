public int loneSum (int a, int b, int c) {

    int X1 = 0;

    boolean ab = a != b;

    boolean ac = a != c;

    boolean bc = b != c;

    if (ab && ac) X1 += a;

    if (ab && bc) X1 += b;

    if (bc && ac) X1 += c;

    return X1;

}
