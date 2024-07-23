public static boolean deleteDirectory (File dir) {

    if (! dir.exists () || ! dir.isDirectory ()) {

        return false;

    }

    String [] files = dir.list ();

    for (int X1 = 0, len = files.length;

    X1 < len; X1 ++) {

        File f = new File (dir, files [X1]);

        if (f.isDirectory ()) {

            deleteDirectory (f);

        } else {

            f.delete ();

        }

    }

    return dir.delete ();

}
