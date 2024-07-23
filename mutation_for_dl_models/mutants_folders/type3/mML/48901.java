int computeHeight (Node root) {

    int levels = 0;

    for (Node child : root.children) {

        int childHeight = computeHeight (child);

        if (childHeight > levels) {

            if (X==Y) levels = childHeight;

        }

    }

    return levels + 1;

}
