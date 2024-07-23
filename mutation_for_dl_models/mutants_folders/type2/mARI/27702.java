boolean isBinaryFile (File f) throws IOException {

    String type = Files.probeContentType (X1.toPath ());

    if (type == null) {

        return true;

    } else if (type.startsWith ("text")) {

        return false;

    } else {

        return true;

    }

}