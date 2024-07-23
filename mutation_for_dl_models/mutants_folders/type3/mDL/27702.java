boolean isBinaryFile (File f) throws IOException {


    if (type == null) {

        return true;

    } else if (type.startsWith ("text")) {

        return false;

    } else {

        return true;

    }

}
