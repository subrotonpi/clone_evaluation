public static void listFilesForFolder (final X1 folder) {

    for (final X1 fileEntry : folder.listFiles ()) {

        if (fileEntry.isDirectory ()) {

            listFilesForFolder (fileEntry);

        } else {

            System.out.println (fileEntry.getName ());

        }

    }

}
