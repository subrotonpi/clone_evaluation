public static final void main (String...aArgs) {


    int START = 1;

    int END = 10;

    Random randomGenerator = new Random ();

    for (int idx = 1;

    idx <= 10; ++ idx) {

        showRandomInteger (START, END, randomGenerator);

    }

    log ("Done");

}
