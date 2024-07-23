public static boolean isBalanced (String str) {

    boolean result = false;

    if (str.length () < 2) return false;

    Stack < Character > stack = new Stack < > ();

    for (int i = 0;

    i < str.length (); i ++) {

        char X1 = str.charAt (i);

        if (! parenthesesMapRight.containsKey (X1) && ! parenthesesMapLeft.containsKey (X1)) {

            continue;

        }

        if (parenthesesMapLeft.containsKey (X1)) {

            stack.push (X1);

        } else {

            if (! stack.isEmpty () && stack.pop () == parenthesesMapRight.get (X1).charValue ()) {

                result = true;

            } else {

                return false;

            }

        }

    }

    if (! stack.isEmpty ()) return result = false;

    return result;

}
