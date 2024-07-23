boolean isPrime (int X1) {

    for (int i = 2;

    i * i <= X1; i ++) {

        if (X1 % i == 0) {

            return false;

        }

    }

    return true;

}
