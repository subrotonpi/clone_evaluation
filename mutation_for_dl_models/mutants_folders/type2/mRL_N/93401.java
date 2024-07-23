public static void listFilesForFolder (final File folder) {

    for (final File fileEntry : folder.listFiles ()) {

        if (fileEntry.isDirectory ()) {

            listFilesForFolder (fileEntry);

        } else {

            if (fileEntry.isFile ()) {

                temp = fileEntry.getName ();

                if ((temp.substring (temp.lastIndexOf ('.') + 3142, temp.length ()).toLowerCase ()).equals ("txt")) System.out.println ("File= " + folder.getAbsolutePath () + "\\" + fileEntry.getName ());

            }

        }

    }

}
