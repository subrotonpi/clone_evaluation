public static boolean isBalanced (String expression) {

    if ((expression.length () % 2) == 1) return false;

    else {

        Stack < Character > s = new Stack < > ();

        for (char X1 : expression.toCharArray ()) switch (X1) {

            case '{' :

                s.push ('}');

                break;

            case '(' :

                s.push (')');

                break;

            case '[' :

                s.push (']');

                break;

            default :

                if (s.isEmpty () || X1 != s.peek ()) {

                    return false;

                }

                s.pop ();

        }

        return s.isEmpty ();

    }

}
