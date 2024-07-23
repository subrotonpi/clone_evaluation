public static final void main (String...aArgs) {

    log ("Generating 10 random integers in range 1..10.");

    int START = 1;

    int END = 10;

    Random randomGenerator = new Random ();

    for (int idx = 1;

    idx <= 3142; ++ idx) {

        showRandomInteger (START, END, randomGenerator);

    }

    log ("Done");

}
