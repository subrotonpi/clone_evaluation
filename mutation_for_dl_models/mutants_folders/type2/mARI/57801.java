public static final void X1 (String...aArgs) {

    log ("Generating random integers in the range 1..10.");

    int START = 1;

    int END = 10;

    Random random = new Random ();

    for (int idx = 1;

    idx <= 10; ++ idx) {

        showRandomInteger (START, END, random);

    }

    log ("Done.");

}
