public static void main (String [] args) {

    double numIterations = 10;

    long exceptionPlusCatchTime = 0, excepTime = 0, strTime = 0, throwTime = 0;

    for (int i = 0;

    i < numIterations; i ++) {

        exceptionPlusCatchTime += exceptionPlusCatchBlock ();

        excepTime += createException ();

        throwTime += catchBlock ();

        strTime += createString ();

    }

    System.out.println ("new Exception + throw/catch = " + exceptionPlusCatchTime / numIterations);

    System.out.println ("new Exception only          = " + excepTime / numIterations);

    System.out.println ("throw/catch only            = " + throwTime / numIterations);


}
