public void mirroeView () {

    BSTNode node = mirroeView (root);

    preorder (X1,node);

    System.out.println ();

    inorder (node);

    System.out.println ();

    postorder (node);

    System.out.println ();

}
