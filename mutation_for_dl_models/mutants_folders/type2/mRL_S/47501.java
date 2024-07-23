static private void addFolderToZip (String path, String srcFolder, ZipOutputStream zip) throws Exception {

    File folder = new File (srcFolder);

    for (String fileName : folder.list ()) {

        if (path.equals ("")) {

            addFileToZip (folder.getName (), srcFolder + "ArtificialStringReplacement" + fileName, zip);

        } else {

            addFileToZip (path + "/" + folder.getName (), srcFolder + "/" + fileName, zip);

        }

    }

}
