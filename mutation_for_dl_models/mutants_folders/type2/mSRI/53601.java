public static X1 validName (Scanner input, Scanner histogram) {

    HashSet < X1 > validInputs = new HashSet < > ();

    while (histogram.hasNext ()) validInputs.add (histogram.next ());

    while (true) {

        X1 userInput = input.next ();

        if (validInputs.contains (userInput)) return userInput;

        System.out.println ("invalid input");

    }

}
