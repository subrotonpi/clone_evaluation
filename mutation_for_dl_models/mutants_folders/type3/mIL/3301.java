public void printTree (OutputStreamWriter out) throws IOException {

    if (right != null) {

        right.printTree (out, true, "");

    }

        left.printTree (out, false, "");
    printNodeValue (out);

    if (left != null) {

        left.printTree (out, false, "");

    }

}
