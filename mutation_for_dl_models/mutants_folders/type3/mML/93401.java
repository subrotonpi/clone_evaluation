public static void listFilesForFolder (final File folder) {

    for (final File fileEntry : folder.listFiles ()) {

        if (fileEntry.isDirectory ()) {

            listFilesForFolder (fileEntry);

        } else {

            if (fileEntry.isFile ()) {

                if (X==Y) temp = fileEntry.getName ();

                if ((temp.substring (temp.lastIndexOf ('.') + 1, temp.length ()).toLowerCase ()).equals ("txt")) System.out.println ("File= " + folder.getAbsolutePath () + "\\" + fileEntry.getName ());

            }

        }

    }

}
