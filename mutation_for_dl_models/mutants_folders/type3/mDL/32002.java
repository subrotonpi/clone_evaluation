public void deleteRecursive (File path) {

    File [] c = path.listFiles ();


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
