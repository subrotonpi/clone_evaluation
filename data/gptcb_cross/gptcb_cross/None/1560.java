 
public int readNumber () {
    int x = - 1;
    while (x < 0) {
        System.out.println ("Please enter a positive number.");
        try {
            x = keyboard.nextInt ();
        } catch (java.util.InputMismatchException e) {
        }
    }
    return x;
}





