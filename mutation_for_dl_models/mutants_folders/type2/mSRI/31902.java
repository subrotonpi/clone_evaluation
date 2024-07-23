public void deleteRecursive (X1 path) {

    X1 [] c = path.listFiles ();

    System.out.println ("Cleaning out folder:" + path.toString ());

    for (X1 file : c) {

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
