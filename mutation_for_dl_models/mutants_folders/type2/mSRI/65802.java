private static char findFirstCharacter (String s) {

    HashSet < Character > unique = new LinkedHashSet < > (), X1 = new HashSet < > ();

    for (int i = 0;

    i < s.length (); i ++) {

        char c = s.charAt (i);

        if (X1.add (c)) unique.add (c);

        else unique.remove (c);

    }

    return unique.isEmpty () ? '_' : unique.iterator ().next ();

}
