public static void main (String [] args) {

    System.out.println ("Please enter the String");

    Scanner input = new Scanner (System.in);

    String userInput = input.nextLine ().trim ();

    int numOfWords = getNumberOfWords (userInput);

    char words [] [] = new char [numOfWords + 1] [];

    words = getWordsFromString ();

    System.out.println ("Total number of words found in the String is " + (numOfWords));

    for (int i = 0;

    i < numOfWords; i ++) {

        System.out.println (" ");

        for (int j = 0;

        j < words [i].length; j ++) {

            System.out.print (words [i] [j]);

        }

    }

}
