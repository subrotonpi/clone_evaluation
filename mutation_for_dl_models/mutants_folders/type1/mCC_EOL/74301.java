public static long factorial (int n) {

    try {

        System.out.println ("factorial(" + n + ")");

        if (n == 1) {

            System.out.println ("return 1");

            return 1;

        }

        return n * factorial (n - 1);
 // EOL Comment
    } finally {

        System.out.println ("return " + n);

    }

}
