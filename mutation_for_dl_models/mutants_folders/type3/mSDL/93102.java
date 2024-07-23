private void expandAllNodes (JTree tree) {

    int j = tree.getRowCount ();

    int i = 0;

    while (i < j) {

        tree.expandRow ();

        i += 1;

        j = tree.getRowCount ();

    }

}
