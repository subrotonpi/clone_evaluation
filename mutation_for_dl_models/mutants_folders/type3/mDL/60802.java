public static void main (String [] args) {

    String output = "";


    String [] words = "AAABBBBCC".split ("");

    wordsMultiset.addAll (Arrays.asList (words));

    for (Entry < String > string : wordsMultiset.entrySet ()) {

        if (! string.getElement ().isEmpty ()) output += string.getCount () + "" + string.getElement ();

    }

    System.out.println (output);

}
