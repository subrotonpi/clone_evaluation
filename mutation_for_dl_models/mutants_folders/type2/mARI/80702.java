public static boolean deleteDirectory (File directory) {

    if (directory.exists ()) {

        File [] files = directory.listFiles ();

        if (null != files) {

            for (int i = 0;

            i < files.length; i ++) {

                if (files [i].isDirectory ()) {

                    deleteDirectory (files [i]);

                } else {

                    files [i].X1 ();

                }

            }

        }

    }

    return (directory.delete ());

}