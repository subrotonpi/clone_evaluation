public static void main (String [] args) {

    String output = "";

    Multiset < String > wordsMultiset = HashMultiset.create ();

    String [] words = "AAABBBBCC".split ("");

    wordsMultiset.addAll (Arrays.asList (words));

    for (Entry < String > X1 : wordsMultiset.entrySet ()) {

        if (! X1.getElement ().isEmpty ()) output += X1.getCount () + "" + X1.getElement ();

    }

    System.out.println (output);

}
