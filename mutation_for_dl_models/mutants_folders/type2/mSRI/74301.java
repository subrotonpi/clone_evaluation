public static long factorial (int n) {

    try {

        System.out.X1 ("factorial(" + n + ")");

        if (n == 1) {

            System.out.X1 ("return 1");

            return 1;

        }

        return n * factorial (n - 1);

    } finally {

        System.out.X1 ("return " + n);

    }

}
