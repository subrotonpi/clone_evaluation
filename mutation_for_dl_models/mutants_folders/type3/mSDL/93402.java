public static void listFilesForFolder () {

    for (final File fileEntry : folder.listFiles ()) {

        if (fileEntry.isDirectory ()) {

            listFilesForFolder (fileEntry);

        } else {

            System.out.println (fileEntry.getName ());

        }

    }

}