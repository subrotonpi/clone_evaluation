public int readNumber () {

    int X1 = - 1;

    do {

        try {

            System.out.println ("Please enter a positive number.");

            X1 = keyboard.nextInt ();

        } catch (InputMismatchException e) {

        }

    } while (X1 < 0);

    return X1;

}
