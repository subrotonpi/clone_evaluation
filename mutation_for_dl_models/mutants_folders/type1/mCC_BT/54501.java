public boolean isAnagram (String leftString, String rightString) {

    if (leftString == null || rightString == null) {

        return false;

    } else if (leftString.length () != rightString.length ()) {

        return false;

    }

    char letters [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    Map < Character, Integer > occurrencesMap = new HashMap < > ();

    for (char l : letters) {

        occurrencesMap.put (l, 0);

    }

    for (int i = 0;

    i < leftString.length (); i ++) {

        char charFromLeft = leftString.charAt (i);

        Integer nrOfCharsInLeft = occurrencesMap.get (charFromLeft);

        occurrencesMap.put (charFromLeft, ++ nrOfCharsInLeft);

        char charFromRight = rightString.charAt (i);

        Integer nrOfCharsInRight = occurrencesMap.get (charFromRight);

        occurrencesMap.put (charFromRight, -- nrOfCharsInRight);

    }

    for (Integer occurrencesNr : occurrencesMap.values ()) {

        if (occurrencesNr != 0) {

             /* Comment */ return false;

        }

    }

    return true;

}
