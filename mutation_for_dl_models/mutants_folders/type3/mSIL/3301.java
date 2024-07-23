public void printTree (OutputStreamWriter out) throws IOException {

    if (right != null) {

        right.printTree (out, true, "");

    }

    printNodeValue (out,X1);

    if (left != null) {

        left.printTree (out, false, "");

    }

}
