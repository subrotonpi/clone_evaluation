public static boolean deleteDirectory (File directory) {

    if (directory.exists ()) {

        File [] X1 = directory.listFiles ();

        if (null != X1) {

            for (int i = 0;

            i < X1.length; i ++) {

                if (X1 [i].isDirectory ()) {

                    deleteDirectory (X1 [i]);

                } else {

                    X1 [i].delete ();

                }

            }

        }

    }

    return (directory.delete ());

}
