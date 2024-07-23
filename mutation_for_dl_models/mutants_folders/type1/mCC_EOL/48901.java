int computeHeight (Node root) {

    int levels = 0;

    for (Node child : root.children) {

        int childHeight = computeHeight (child);

        if (childHeight > levels) {

            levels = childHeight;

        }

    }
 // EOL Comment
    return levels + 1;

}
