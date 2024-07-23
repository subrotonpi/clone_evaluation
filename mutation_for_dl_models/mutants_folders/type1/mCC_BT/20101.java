public void mirroeView () {

    BSTNode node = mirroeView (root);

    preorder (node);

    System.out.println ();

    inorder (node); /* Comment */ 

    System.out.println ();

    postorder (node);

    System.out.println ();

}
