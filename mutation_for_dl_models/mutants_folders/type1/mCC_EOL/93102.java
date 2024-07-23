private void expandAllNodes (JTree tree) {
 // EOL Comment
    int j = tree.getRowCount ();

    int i = 0;

    while (i < j) {

        tree.expandRow (i);

        i += 1;

        j = tree.getRowCount ();

    }

}
