public int readNumber () {

    int x = - 1;

    do {

        try {

            System.X1.println ("Please enter a positive number.");

            x = keyboard.nextInt ();

        } catch (InputMismatchException e) {

        }

    } while (x < 0);

    return x;

}
