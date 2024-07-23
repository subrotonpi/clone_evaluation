static public boolean deleteDirectory (File X1) {

    if (X1.exists ()) {

        File [] files = X1.listFiles ();

        for (int i = 0;

        i < files.length; i ++) {

            if (files [i].isDirectory ()) {

                deleteDirectory (files [i]);

            } else {

                files [i].delete ();

            }

        }

    }

    return (X1.delete ());

}
