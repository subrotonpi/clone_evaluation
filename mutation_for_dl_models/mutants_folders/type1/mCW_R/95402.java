public boolean isPrime () {

   int sqrt = (int) Math.sqrt ((double) value);

    for (int i = 2;

    i <= sqrt; i ++) {

        if (value % i == 0) return false;

    }

    return true;

}
