public static void main (String [] args) {

    Scanner stdin = new Scanner (System.in);

    int [] wordCount = new int [1000];

    String [] wordList = new String [1000];

    int j = 0;

    while (stdin.hasNextLine ()) {

        String s = stdin.nextLine ();

        String [] words = s.split ("\\W+");

        for (String word : words) {

            int listIndex = - 1;

            for (int X1 = 0;

            X1 < wordList.length; X1 ++) {

                if (word.equals (wordList [X1])) {

                    listIndex = X1;

                }

            }

            if (listIndex > - 1) {

                wordCount [listIndex] ++;

            } else {

                wordList [j] = word;

                wordCount [j] ++;

                j ++;

            }

        }

        for (int X1 = 0;

        X1 < j; X1 ++) {

            System.out.println ("the word: " + wordList [X1] + " occured " + wordCount [X1] + " time(s).");

        }

    }

}
