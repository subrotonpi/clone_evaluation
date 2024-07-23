public static boolean isBalanced (String expression) {

    if ((expression.length () % 2) == 1) return false;

    else {

        Stack < Character > X1 = new Stack < > ();

        for (char bracket : expression.toCharArray ()) switch (bracket) {

            case '{' :

                X1.push ('}');

                break;

            case '(' :

                X1.push (')');

                break;

            case '[' :

                X1.push (']');

                break;

            default :

                if (X1.isEmpty () || bracket != X1.peek ()) {

                    return false;

                }

                X1.pop ();

        }

        return X1.isEmpty ();

    }

}
