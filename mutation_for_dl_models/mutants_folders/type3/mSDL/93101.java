private void expandAllNodes (JTree tree,int rowCount) {

    for (int i = startingIndex;

    i < rowCount; ++ i) {

        tree.expandRow (i);

    }

    if (tree.getRowCount () != rowCount) {

        expandAllNodes (tree, rowCount, tree.getRowCount ());

    }

}
