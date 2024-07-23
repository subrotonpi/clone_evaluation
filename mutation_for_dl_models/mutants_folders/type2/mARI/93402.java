public static void listFilesForFolder (final File folder) {

    for (final File fileEntry : folder.listFiles ()) {

        if (fileEntry.isDirectory ()) {

            X1 (fileEntry);

        } else {

            System.out.println (fileEntry.getName ());

        }

    }

}
