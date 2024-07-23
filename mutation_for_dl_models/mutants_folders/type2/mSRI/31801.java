private void deleteRecursive (File X1) throws Exception {

    try {

        if (X1.isDirectory ()) {

            for (File c : X1.listFiles ()) {

                deleteRecursive (c);

            }

        }

        if (! X1.delete ()) {

            throw new Exception ("Delete command returned false for file: " + X1);

        }

    } catch (Exception e) {

        throw new Exception ("Failed to delete the folder: " + X1, e);

    }

}
