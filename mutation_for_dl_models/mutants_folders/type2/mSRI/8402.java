public static final int gcd (int X1, int b) {

    if (X1 == Integer.MIN_VALUE) {

        if (b == Integer.MIN_VALUE) throw new IllegalArgumentException ("gcd() is greater than Integer.MAX_VALUE");

        return 1 << Integer.numberOfTrailingZeros (Math.abs (b));

    }

    if (b == Integer.MIN_VALUE) return 1 << Integer.numberOfTrailingZeros (Math.abs (X1));

    X1 = Math.abs (X1);

    b = Math.abs (b);

    if (X1 == 0) return b;

    if (b == 0) return X1;

    int factorsOfTwoInA = Integer.numberOfTrailingZeros (X1), factorsOfTwoInB = Integer.numberOfTrailingZeros (b), commonFactorsOfTwo = Math.min (factorsOfTwoInA, factorsOfTwoInB);

    X1>>= factorsOfTwoInA;

    b>>= factorsOfTwoInB;

    while (X1 != b) {

        if (X1 > b) {

            X1 = (X1 - b);

            X1>>= Integer.numberOfTrailingZeros (X1);

        } else {

            b = (b - X1);

            b>>= Integer.numberOfTrailingZeros (b);

        }

    }

    return X1 << commonFactorsOfTwo;

}
