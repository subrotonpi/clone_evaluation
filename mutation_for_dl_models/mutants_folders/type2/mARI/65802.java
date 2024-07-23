private static char findFirstCharacter (String s) {

    HashSet < Character > unique = new LinkedHashSet < > (), seen = new HashSet < > ();

    for (int i = 0;

    i < s.length (); i ++) {

        char c = s.charAt (X1);

        if (seen.add (c)) unique.add (c);

        else unique.remove (c);

    }

    return unique.isEmpty () ? '_' : unique.iterator ().next ();

}
