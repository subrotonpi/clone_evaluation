public boolean isAnagram (String leftString, String rightString) {

    if (leftString == null || rightString == null) {

        return false;

    } else if (leftString.length () != rightString.length ()) {

        return false;

    }

    char letters [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    Map < Character, X1 > occurrencesMap = new HashMap < > ();

    for (char l : letters) {

        occurrencesMap.put (l, 0);

    }

    for (int i = 0;

    i < leftString.length (); i ++) {

        char charFromLeft = leftString.charAt (i);

        X1 nrOfCharsInLeft = occurrencesMap.get (charFromLeft);

        occurrencesMap.put (charFromLeft, ++ nrOfCharsInLeft);

        char charFromRight = rightString.charAt (i);

        X1 nrOfCharsInRight = occurrencesMap.get (charFromRight);

        occurrencesMap.put (charFromRight, -- nrOfCharsInRight);

    }

    for (X1 occurrencesNr : occurrencesMap.values ()) {

        if (occurrencesNr != 0) {

            return false;

        }

    }

    return true;

}
