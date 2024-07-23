int computeHeight (Node root) {

    int levels = 0;

    for (Node child : root.children) {

        int X1 = computeHeight (child);

        if (X1 > levels) {

            levels = X1;

        }

    }

    return levels + 1;

}
