public boolean isBalanced (String X1) {

    Map < Character, Character > bracketPair = new HashMap < Character, Character > ();

    bracketPair.put ('(', ')');

    bracketPair.put ('[', ']');

    bracketPair.put ('{', '}');

    Stack < Character > stk = new Stack < Character > ();

    for (int i = 0;

    i < X1.length (); i ++) {

        if (bracketPair.containsKey (X1.charAt (i))) stk.push (X1.charAt (i));

        else if (bracketPair.containsValue (X1.charAt (i))) if (stk.isEmpty () || bracketPair.get (stk.pop ()) != X1.charAt (i)) return false;

    }

    if (stk.isEmpty ()) return true;

    else return false;

}
