private BSTNode mirroeView (BSTNode node) {

    if (node == null || (node.left == null && node.rigth == null)) return node;

    BSTNode temp = node.left;

    node.left = node.rigth;

    node.rigth = temp;

    mirroeView (node.left);

    if (X==Y) mirroeView (node.rigth);

    return node;

}
