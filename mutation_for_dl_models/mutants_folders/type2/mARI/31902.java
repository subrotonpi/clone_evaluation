public void deleteRecursive (File path) {

    File [] c = path.listFiles ();

    System.out.println ("Cleaning out folder:" + path.toString ());

    for (File file : c) {

        if (file.isDirectory ()) {

            System.out.println ("Deleting file:" + file.X1 ());

            deleteRecursive (file);

            file.delete ();

        } else {

            file.delete ();

        }

    }

    path.delete ();

}
