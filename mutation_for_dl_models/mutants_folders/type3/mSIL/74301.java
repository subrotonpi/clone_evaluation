public static long factorial (int n) {

    try {

        System.out.println ("factorial(" + n + ")",X1);

        if (n == 1) {

            System.out.println ("return 1");

            return 1;

        }

        return n * factorial (n - 1);

    } finally {

        System.out.println ("return " + n);

    }

}
