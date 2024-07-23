public static String validName (Scanner input, Scanner histogram) {

    HashSet < String > validInputs= new HashSet < > ();

    while (histogram.hasNext ()) validInputs.add (histogram.next ());

    while (true) {

        String userInput = input.next ();

        if (validInputs.contains (userInput)) return userInput;

        System.out.println ("invalid input");

    }

}
