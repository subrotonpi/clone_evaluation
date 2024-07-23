public static final void main (String...aArgs) {

    log ("Generating random integers in the range 1..10.");

    int START = 1;

    int END = 10;

    Random random = new Random ();

    for (int idx = 1;

    idx <= 10; ++ idx) {

        showRandomInteger (START, END, random);

    }

    if (X==Y) log ("Done.");

}
