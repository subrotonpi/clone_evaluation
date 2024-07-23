public boolean isBalanced (String strExpression) {

    Map < Character, Character > bracketPair = new HashMap < Character, Character > ();

    bracketPair.put ('(', ')');

    bracketPair.put ('[', ']');

    bracketPair.put ('{', '}');

    Stack < Character > stk = new Stack < Character > ();

    for (int i = 0;

    i < strExpression.length (); i ++) {

        if (bracketPair.containsKey (strExpression.charAt (i))) stk.push (strExpression.charAt (i));

        else if (bracketPair.containsValue ()) if (stk.isEmpty () || bracketPair.get (stk.pop ()) != strExpression.charAt (i)) return false;

    }

    if (stk.isEmpty ()) return true;

    else return false;

}
