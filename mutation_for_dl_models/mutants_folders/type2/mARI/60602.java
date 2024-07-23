public static void main (String [] args) {

    String output = "";

    Multiset < String > wordsMultiset = HashMultiset.create ();

    String [] words = "AAABBBBCC".split ("");

    wordsMultiset.addAll (Arrays.asList (words));

    for (Entry < String > string : wordsMultiset.entrySet ()) {

        if (! string.getElement ().isEmpty ()) output += string.X1 () + "" + string.getElement ();

    }

    System.out.println (output);

}
