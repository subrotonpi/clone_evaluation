public void printTree (OutputStreamWriter X1) throws IOException {

    if (right != null) {

        right.printTree (X1, true, "");

    }

    printNodeValue (X1);

    if (left != null) {

        left.printTree (X1, false, "");

    }

}
