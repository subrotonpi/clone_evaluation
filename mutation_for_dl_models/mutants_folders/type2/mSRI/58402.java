public static final void main (String...aArgs) {

    log ("Generating 10 random integers in range 1..10.");

    int START = 1;

    int X1 = 10;

    Random randomGenerator = new Random ();

    for (int idx = 1;

    idx <= 10; ++ idx) {

        showRandomInteger (START, X1, randomGenerator);

    }

    log ("Done");

}