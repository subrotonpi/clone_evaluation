public static boolean isBalanced (String str) {

    boolean result = false;

    if (str.length () < 2) return false;

    Stack < Character > stack = new Stack < > ();

    for (int X1 = 0;

    X1 < str.length (); X1 ++) {

        char ch = str.charAt (X1);

        if (! parenthesesMapRight.containsKey (ch) && ! parenthesesMapLeft.containsKey (ch)) {

            continue;

        }

        if (parenthesesMapLeft.containsKey (ch)) {

            stack.push (ch);

        } else {

            if (! stack.isEmpty () && stack.pop () == parenthesesMapRight.get (ch).charValue ()) {

                result = true;

            } else {

                return false;

            }

        }

    }

    if (! stack.isEmpty ()) return result = false;

    return result;

}
