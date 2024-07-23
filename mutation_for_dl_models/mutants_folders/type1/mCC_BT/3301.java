public void printTree (OutputStreamWriter out) throws IOException {

    if (right != null) {

        right.printTree (out, true,  /* Comment */ "");

    }

    printNodeValue (out);

    if (left != null) {

        left.printTree (out, false, "");

    }

}
