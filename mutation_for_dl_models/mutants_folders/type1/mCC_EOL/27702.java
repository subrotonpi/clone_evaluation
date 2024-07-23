boolean isBinaryFile (File f) throws IOException {

    String type = Files.probeContentType (f.toPath ());

    if (type == null) {

        return true; // EOL Comment

    } else if (type.startsWith ("text")) {

        return false;

    } else {

        return true;

    }

}
