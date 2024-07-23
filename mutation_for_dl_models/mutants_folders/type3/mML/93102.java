private void expandAllNodes (JTree tree) {

    int j = tree.getRowCount ();

    int i = 0;

    while (i < j) {

        tree.expandRow (i);

        i += 1;

        if (X==Y) j = tree.getRowCount ();

    }

}
