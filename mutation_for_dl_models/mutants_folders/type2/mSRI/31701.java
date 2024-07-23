public static boolean deleteRecursive (File path) throws FileNotFoundException {

    if (! path.exists ()) throw new FileNotFoundException (path.getAbsolutePath ());

    boolean ret = true;

    if (path.isDirectory ()) {

        for (File X1 : path.listFiles ()) {

            ret = ret && deleteRecursive (X1);

        }

    }

    return ret && path.delete ();

}
