public void inOrder () {

    Stack < BSTNode > myStack = new Stack < BSTNode > ();

    Set < BSTNode > visited = new HashSet < BSTNode > ();

    BSTNode X1 = m_root;

    if (X1 != null) myStack.push (X1);

    while (! myStack.isEmpty ()) {

        X1 = myStack.peek ();

        if (X1.getLeft () != null && ! visited.contains (X1.getLeft ())) myStack.push (X1.getLeft ());

        else {

            System.out.print (X1.getInfo () + " ");

            visited.add (X1);

            myStack.pop ();

            if (X1.getRight () != null && ! visited.contains (X1.getRight)) myStack.push (X1.getRight ());

        }

    }

}
