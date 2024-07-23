public static final void main (String...aArgs) {

    log ();

    int START = 1;

    int END = 10;

    Random random = new Random ();

    for (int idx = 1;

    idx <= 10; ++ idx) {

        showRandomInteger (START, END, random);

    }

    log ("Done.");

}
