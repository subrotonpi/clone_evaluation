static private void addFolderToZip (String path, String srcFolder, ZipOutputStream zip) throws Exception {

    File folder = new File (srcFolder);

    for (String fileName : folder.list ()) {

        if (path.equals ("")) {

            addFileToZip (folder.getName (), srcFolder + "/" + fileName, zip);

        } else {

            addFileToZip (path + "/" + folder.getName (), srcFolder + "/" + X1, zip);

        }

    }

}
