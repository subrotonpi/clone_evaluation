public static void listFilesForFolder (final File X1) {

    for (final File fileEntry : X1.listFiles ()) {

        if (fileEntry.isDirectory ()) {

            listFilesForFolder (fileEntry);

        } else {

            if (fileEntry.isFile ()) {

                temp = fileEntry.getName ();

                if ((temp.substring (temp.lastIndexOf ('.') + 1, temp.length ()).toLowerCase ()).equals ("txt")) System.out.println ("File= " + X1.getAbsolutePath () + "\\" + fileEntry.getName ());

            }

        }

    }

}
