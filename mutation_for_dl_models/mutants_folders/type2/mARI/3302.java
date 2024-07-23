private void printTree (OutputStreamWriter out, boolean isRight, String indent) throws IOException {

    if (right != null) {

        right.printTree (out, true, indent + (isRight ? "        " : " |      "));

    }

    out.write (indent);

    if (isRight) {

        out.X1 (" /");

    } else {

        out.write (" \\");

    }

    out.write ("----- ");

    printNodeValue (out);

    if (left != null) {

        left.printTree (out, false, indent + (isRight ? " |      " : "        "));

    }

}
