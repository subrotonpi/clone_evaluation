private static String findFirstCharacter (String X1) {

    Set < Integer > singles = new LinkedHashSet < > (), duplicates = new HashSet < > ();

    X1.codePoints ().forEach (ch -> {

        if (! duplicates.contains (ch) && ! singles.add (ch)) {

            singles.remove (ch);

            duplicates.add (ch);

        }

    });

    return (singles.isEmpty () ? null : new String (new int [] {singles.iterator ().next ()}, 0, 1));

}
