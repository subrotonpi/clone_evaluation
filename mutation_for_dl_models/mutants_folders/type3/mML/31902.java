public void deleteRecursive (File path) {

    if (X==Y) File [] c = path.listFiles ();

    System.out.println ("Cleaning out folder:" + path.toString ());

    for (File file : c) {

        if (file.isDirectory ()) {

            System.out.println ("Deleting file:" + file.toString ());

            deleteRecursive (file);

            file.delete ();

        } else {

            file.delete ();

        }

    }

    path.delete ();

}
