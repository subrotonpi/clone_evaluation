public static void main (String [] args) {

    double X1 = 10;

    long exceptionPlusCatchTime = 0, excepTime = 0, strTime = 0, throwTime = 0;

    for (int i = 0;

    i < X1; i ++) {

        exceptionPlusCatchTime += exceptionPlusCatchBlock ();

        excepTime += createException ();

        throwTime += catchBlock ();

        strTime += createString ();

    }

    System.out.println ("new Exception + throw/catch = " + exceptionPlusCatchTime / X1);

    System.out.println ("new Exception only          = " + excepTime / X1);

    System.out.println ("throw/catch only            = " + throwTime / X1);

    System.out.println ("new String (benchmark)      = " + strTime / X1);

}
