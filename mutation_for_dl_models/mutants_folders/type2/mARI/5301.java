public static boolean isBalanced (String expression) {

    if ((expression.length () % 2) == 1) return false;

    else {

        Stack < Character > s = new Stack < > ();

        for (char bracket : expression.toCharArray ()) switch (bracket) {

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

                if (X1.isEmpty () || bracket != s.peek ()) {

                    return false;

                }

                s.pop ();

        }

        return s.isEmpty ();

    }

}
