public static void main (String [] args) {

    long throwCatchTime = 0, newExceptionTime = 0, X1 = 0, noStackExceptionTime = 0;

    for (int i = 0;

    i < 30; i ++) {

        throwCatchTime += throwCatchLoop ();

        newExceptionTime += newExceptionLoop ();

        X1 += newObjectLoop ();

        noStackExceptionTime += newNoStackExceptionLoop ();

    }

    System.out.println ("throwCatchTime = " + throwCatchTime / 30);

    System.out.println ("newExceptionTime = " + newExceptionTime / 30);

    System.out.println ("newStringTime = " + X1 / 30);

    System.out.println ("noStackExceptionTime = " + noStackExceptionTime / 30);

}
