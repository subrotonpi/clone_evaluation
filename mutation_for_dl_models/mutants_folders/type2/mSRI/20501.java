static boolean isAnagram (String a, String X1) {

    a = a.toLowerCase ();

    X1 = X1.toLowerCase ();

    if (a.length () != X1.length ()) {

        return false;

    }

    char [] chars = a.toCharArray ();

    for (char c : chars) {

        int index = X1.indexOf (c);

        if (index != - 1) {

            X1 = X1.substring (0, index) + X1.substring (index + 1, X1.length ());

        } else {

            return false;

        }

    }

    return X1.isEmpty ();

}
