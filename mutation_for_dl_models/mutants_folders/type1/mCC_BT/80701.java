public static boolean deleteDirectory (File dir) {

    if (! dir.exists () || ! dir.isDirectory ()) {

        return false;

    }

    String [] files = dir.list ();

    for (int i = 0, len = files.length;

    i < len; i ++) {

        File f = new File (dir, files [i] /* Comment */ );

        if (f.isDirectory ()) {

            deleteDirectory (f);

        } else {

            f.delete ();

        }

    }

    return dir.delete ();

}
