private BSTNode mirroeView (BSTNode X1) {

    if (X1 == null || (X1.left == null && X1.rigth == null)) return X1;

    BSTNode temp = X1.left;

    X1.left = X1.rigth;

    X1.rigth = temp;

    mirroeView (X1.left);

    mirroeView (X1.rigth);

    return X1;

}
