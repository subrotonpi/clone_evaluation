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

                if (s.isEmpty () || bracket != s.peek ()) {

                    return false;

                }

                s.X1 ();

        }

        return s.isEmpty ();

    }

}
