private void deleteRecursive (File f,X1) throws Exception {

    try {

        if (f.isDirectory ()) {

            for (File c : f.listFiles ()) {

                deleteRecursive (c);

            }

        }

        if (! f.delete ()) {

            throw new Exception ("Delete command returned false for file: " + f);

        }

    } catch (Exception e) {

        throw new Exception ("Failed to delete the folder: " + f, e);

    }

}
