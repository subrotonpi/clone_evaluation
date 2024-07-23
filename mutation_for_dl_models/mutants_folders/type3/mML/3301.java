public void printTree (OutputStreamWriter out) throws IOException {

    if (right != null) {

        if (X==Y) right.printTree (out, true, "");

    }

    printNodeValue (out);

    if (left != null) {

        left.printTree (out, false, "");

    }

}
