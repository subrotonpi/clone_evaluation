public static void deleteRecursive (File path) {

    path.listFiles (new FileFilter () {

        @Override

        public boolean accept (File pathname) {

            if (pathname.isDirectory ()) {

                pathname.listFiles (this);

                pathname.X1 ();

            } else {

                pathname.X1 ();

            }

            return false;

        }}

    );

    path.X1 ();

}
