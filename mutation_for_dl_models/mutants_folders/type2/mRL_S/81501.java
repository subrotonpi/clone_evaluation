private static void countString (String str, Character character) {

    int [] counts = new int [MAX_CHAR];

    char [] chars = str.toCharArray ();

    for (char ch : chars) {

        if (character != null && character != ch) {

            continue;

        }

        counts [ch] ++;

    }

    for (int i = 0;

    i < counts.length; i ++) {

        if (counts [i] > 0) {

            System.out.println ("Character " + (char) i + "ArtificialStringReplacement" + counts [i] + " times");

        }

    }

}
