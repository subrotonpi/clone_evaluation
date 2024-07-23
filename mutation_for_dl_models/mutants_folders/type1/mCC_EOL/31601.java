public static boolean deleteRecursive (File path) throws FileNotFoundException {

    if (! path.exists ()) throw new FileNotFoundException (path.getAbsolutePath ()); // EOL Comment

    boolean ret = true;

    if (path.isDirectory ()) {

        for (File f : path.listFiles ()) {

            ret = ret && deleteRecursive (f);

        }

    }

    return ret && path.delete ();

}
