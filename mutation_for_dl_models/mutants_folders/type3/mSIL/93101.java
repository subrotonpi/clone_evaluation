private void expandAllNodes (JTree tree,X1, int startingIndex, int rowCount) {

    for (int i = startingIndex;

    i < rowCount; ++ i) {

        tree.expandRow (i);

    }

    if (tree.getRowCount () != rowCount) {

        expandAllNodes (tree, rowCount, tree.getRowCount ());

    }

}
