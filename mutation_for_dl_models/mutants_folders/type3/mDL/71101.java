public int readNumber () {

    int x = - 1;

    do {

        try {

            System.out.println ("Please enter a positive number.");


        } catch (InputMismatchException e) {

        }

    } while (x < 0);

    return x;

}
