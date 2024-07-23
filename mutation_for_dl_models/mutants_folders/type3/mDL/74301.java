public static long factorial (int n) {

    try {

        System.out.println ("factorial(" + n + ")");

        if (n == 1) {


            return 1;

        }

        return n * factorial (n - 1);

    } finally {

        System.out.println ("return " + n);

    }

}
