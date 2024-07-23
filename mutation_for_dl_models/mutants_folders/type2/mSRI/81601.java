private static void countString (String str, Character character) {

    int [] counts = new int [MAX_CHAR];

    char [] chars = str.toCharArray ();

    for (char ch : chars) {

        if (character != null && character != ch) {

            continue;

        }

        counts [ch] ++;

    }

    for (int X1 = 0;

    X1 < counts.length; X1 ++) {

        if (counts [X1] > 0) {

            System.out.println ("Character " + (char) X1 + " appeared " + counts [X1] + " times");

        }

    }

}
