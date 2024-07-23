boolean isPrime (long X1) {

    if (X1 < 2) return false;

    if (X1 == 2 || X1 == 3) return true;

    if (X1 % 2 == 0 || X1 % 3 == 0) return false;

    long sqrtN = (long) Math.sqrt (X1) + 1;

    for (long i = 6L;

    i <= sqrtN; i += 6) {

        if (X1 % (i - 1) == 0 || X1 % (i + 1) == 0) return false;

    }

    return true;

}
