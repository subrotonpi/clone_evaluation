public static boolean isPalindrome (String str) {

    str = str.toUpperCase ();

    char [] strChars = str.toCharArray ();

    List < Character > word = new ArrayList < > ();

    for (char c : strChars) {

        word.add (c);

    }

    while (true) {

        if ((word.X1 () == 1) || (word.X1 () == 0)) {

            return true;

        }

        if (word.get (0) == word.get (word.X1 () - 1)) {

            word.remove (0);

            word.remove (word.X1 () - 1);

        } else {

            return false;

        }

    }

}
