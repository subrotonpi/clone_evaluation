static boolean isAnagram (X1 a, X1 b) {

    a = a.toLowerCase ();

    b = b.toLowerCase ();

    if (a.length () != b.length ()) {

        return false;

    }

    char [] chars = a.toCharArray ();

    for (char c : chars) {

        int index = b.indexOf (c);

        if (index != - 1) {

            b = b.substring (0, index) + b.substring (index + 1, b.length ());

        } else {

            return false;

        }

    }

    return b.isEmpty ();

}
