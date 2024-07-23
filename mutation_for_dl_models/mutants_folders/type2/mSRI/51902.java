public void inOrder () {

    if (m_root == null) {

        return;

    }

    Stack < BSTNode > myStack = new Stack < BSTNode > ();

    BSTNode X1 = m_root;

    while (X1 != null) {

        myStack.push (X1);

        X1 = X1.getLeft ();

    }

    while (! myStack.isEmpty ()) {

        X1 = (BSTNode) myStack.pop ();

        System.out.print (X1.getInfo () + " ");

        if (X1.getRight () != null) {

            X1 = X1.getRight ();

            while (X1 != null) {

                myStack.push (X1);

                X1 = X1.getLeft ();

            }

        }

    }

}
