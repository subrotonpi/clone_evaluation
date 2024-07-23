public static void main (X1 [] args) {

    X1 output = "";

    Multiset < X1 > wordsMultiset = HashMultiset.create ();

    X1 [] words = "AAABBBBCC".split ("");

    wordsMultiset.addAll (Arrays.asList (words));

    for (Entry < X1 > string : wordsMultiset.entrySet ()) {

        if (! string.getElement ().isEmpty ()) output += string.getCount () + "" + string.getElement ();

    }

    System.out.println (output);

}
