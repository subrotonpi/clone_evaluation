public void deleteRecursive (File path) {

    File [] c = path.listFiles ();

    System.out.println ("Cleaning out folder:" + path.toString ());

    for (File X1 : c) {

        if (X1.isDirectory ()) {

            System.out.println ("Deleting file:" + X1.toString ());

            deleteRecursive (X1);

            X1.delete ();

        } else {

            X1.delete ();

        }

    }

    path.delete ();

}
