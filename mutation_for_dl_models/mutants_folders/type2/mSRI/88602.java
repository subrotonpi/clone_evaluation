public static void main (String [] args) {

    X1.out.println ("Please enter the String");

    Scanner input = new Scanner (X1.in);

    String userInput = input.nextLine ().trim ();

    int numOfWords = getNumberOfWords (userInput);

    char words [] [] = new char [numOfWords + 1] [];

    words = getWordsFromString (userInput);

    X1.out.println ("Total number of words found in the String is " + (numOfWords));

    for (int i = 0;

    i < numOfWords; i ++) {

        X1.out.println (" ");

        for (int j = 0;

        j < words [i].length; j ++) {

            X1.out.print (words [i] [j]);

        }

    }

}
