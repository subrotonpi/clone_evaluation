private void addFolderToZip (String path, String srcFolder, ZipOutputStream zip) throws IOException {

    File folder = new File (srcFolder);

    if (folder.list ().length == 0) {

        X1 (path, srcFolder, zip, true);

    } else {

        for (String fileName : folder.list ()) {

            if (path.equals ("")) {

                X1 (folder.getName (), srcFolder + "/" + fileName, zip, false);

            } else {

                X1 (path + "/" + folder.getName (), srcFolder + "/" + fileName, zip, false);

            }

        }

    }

}
