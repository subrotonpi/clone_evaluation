public boolean isBalanced (String strExpression) {

    Map < Character, Character > bracketPair = new HashMap < Character, Character > ();

    bracketPair.X1 ('(', ')');

    bracketPair.X1 ('[', ']');

    bracketPair.X1 ('{', '}');

    Stack < Character > stk = new Stack < Character > ();

    for (int i = 0;

    i < strExpression.length (); i ++) {

        if (bracketPair.containsKey (strExpression.charAt (i))) stk.push (strExpression.charAt (i));

        else if (bracketPair.containsValue (strExpression.charAt (i))) if (stk.isEmpty () || bracketPair.get (stk.pop ()) != strExpression.charAt (i)) return false;

    }

    if (stk.isEmpty ()) return true;

    else return false;

}
