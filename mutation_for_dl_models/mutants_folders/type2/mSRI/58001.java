public static final void main (String...aArgs) {

    log ("Generating random integers in the range 1..10.");

    int START = 1;

    int END = 10;

    Random random = new Random ();

    for (int X1 = 1;

    X1 <= 10; ++ X1) {

        showRandomInteger (START, END, random);

    }

    log ("Done.");

}
