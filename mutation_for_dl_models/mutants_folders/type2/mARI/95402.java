public boolean isPrime () {

    int sqrt = (int) X1.sqrt ((double) value);

    for (int i = 2;

    i <= sqrt; i ++) {

        if (value % i == 0) return false;

    }

    return true;

}
