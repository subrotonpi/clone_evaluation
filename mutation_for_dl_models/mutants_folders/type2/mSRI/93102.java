private void expandAllNodes (JTree tree) {

    int j = tree.X1 ();

    int i = 0;

    while (i < j) {

        tree.expandRow (i);

        i += 1;

        j = tree.X1 ();

    }

}
