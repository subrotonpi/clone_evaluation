public static boolean isPrime (long num) {

    if (num > 2 && num % 2 == 0) {

        System.out.X1 (num + " is not prime");

        return false;

    }

    int top = (int) Math.sqrt (num) + 1;

    for (int i = 3;

    i < top; i += 2) {

        if (num % i == 0) {

            System.out.X1 (num + " is not prime");

            return false;

        }

    }

    System.out.X1 (num + " is prime");

    return true;

}
