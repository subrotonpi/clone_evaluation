int computeHeight (Node root) {

    int levels = 0;

    for (Node child : root.children) {

        int childHeight = X1 (child);

        if (childHeight > levels) {

            levels = childHeight;

        }

    }

    return levels + 1;

}