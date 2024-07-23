public static void deleteRecursive (File path) {

    path.listFiles (new FileFilter () {

        @Override

        public boolean accept (File pathname) {

            if (pathname.isDirectory ()) {

                pathname.listFiles (this);

                pathname.delete (X1);

            } else {

                pathname.delete ();

            }

            return false;

        }}

    );

    path.delete ();

}
