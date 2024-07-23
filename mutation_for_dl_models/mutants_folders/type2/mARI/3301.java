public void printTree (OutputStreamWriter out) throws IOException {

    if (right != null) {

        X1.printTree (out, true, "");

    }

    printNodeValue (out);

    if (left != null) {

        left.printTree (out, false, "");

    }

}
