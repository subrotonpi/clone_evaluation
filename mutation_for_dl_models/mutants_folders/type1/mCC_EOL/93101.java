private void expandAllNodes (JTree tree, int startingIndex, int rowCount) {

    for (int i = startingIndex;
 // EOL Comment
    i < rowCount; ++ i) {

        tree.expandRow (i);

    }

    if (tree.getRowCount () != rowCount) {

        expandAllNodes (tree, rowCount, tree.getRowCount ());

    }

}
