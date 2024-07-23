public int readNumber () {

    int X1 = - 1;

    while (X1 < 0) {

        System.out.println ("Please enter a positive number.");

        try {

            X1 = keyboard.nextInt ();

        } catch (java.util.InputMismatchException e) {

        }

    }

    return X1;

}
