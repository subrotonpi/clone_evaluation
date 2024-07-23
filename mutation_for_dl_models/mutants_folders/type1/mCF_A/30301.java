public static int loneSum (int a, int b, int c) {

    if (a == b && b == c) {

        a = 0;

        b = 0;

        c = 0;

    }

    if (a == b) {

        a = 0;

     
   b = 0;

    }

    if (a == c) {

        a = 0;

        c = 0;

    }

    if (b == c) {

        b = 0;

        c = 0;

    }

    return a + b + c;

}
