static private void addFolderToZip (String path, String srcFolder, ZipOutputStream zip) throws Exception {

    File folder = new File (srcFolder);

    for (String fileName : folder.list ()) {

        if (path.equals ("")) {

            X1 (folder.getName (), srcFolder + "/" + fileName, zip);

        } else {

            X1 (path + "/" + folder.getName (), srcFolder + "/" + fileName, zip);

        }

    }

}
