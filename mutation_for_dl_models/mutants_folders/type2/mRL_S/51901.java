public void inOrder () {

    Stack < BSTNode > myStack = new Stack < BSTNode > ();

    Set < BSTNode > visited = new HashSet < BSTNode > ();

    BSTNode current = m_root;

    if (current != null) myStack.push (current);

    while (! myStack.isEmpty ()) {

        current = myStack.peek ();

        if (current.getLeft () != null && ! visited.contains (current.getLeft ())) myStack.push (current.getLeft ());

        else {

            System.out.print (current.getInfo () + "ArtificialStringReplacement");

            visited.add (current);

            myStack.pop ();

            if (current.getRight () != null && ! visited.contains (current.getRight)) myStack.push (current.getRight ());

        }

    }

}
