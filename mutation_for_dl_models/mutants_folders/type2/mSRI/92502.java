public static boolean isPrime (int X1) {

    if ((X1 & 1) == 0) {

        return X1 == 2;

    }

    if (X1 < 9) {

        return X1 > 1;

    }

    return isStrongProbablePrime (X1, 2) && isStrongProbablePrime (X1, 7) && isStrongProbablePrime (X1, 61);

}
