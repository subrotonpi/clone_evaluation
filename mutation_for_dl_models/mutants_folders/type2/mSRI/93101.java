private void expandAllNodes (JTree tree, int startingIndex, int rowCount) {

    for (int X1 = startingIndex;

    X1 < rowCount; ++ X1) {

        tree.expandRow (X1);

    }

    if (tree.getRowCount () != rowCount) {

        expandAllNodes (tree, rowCount, tree.getRowCount ());

    }

}
