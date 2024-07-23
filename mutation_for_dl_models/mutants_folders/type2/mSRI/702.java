static void copyFolder (File src, File X1) {

    if (src == null || X1 == null) return;

    if (! src.isDirectory ()) return;

    if (X1.exists ()) {

        if (! X1.isDirectory ()) {

            return;

        }

    } else {

        X1.mkdir ();

    }

    if (src.listFiles () == null || src.listFiles ().length == 0) return;

    String strAbsPathSrc = src.getAbsolutePath ();

    String strAbsPathDest = X1.getAbsolutePath ();

    try {

        Files.walkFileTree (src.toPath (), new SimpleFileVisitor < Path > () {

            @Override

            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {

                File dstFile = new File (strAbsPathDest + file.toAbsolutePath ().toString ().substring (strAbsPathSrc.length ()));

                if (dstFile.exists ()) return FileVisitResult.CONTINUE;

                if (! dstFile.getParentFile ().exists ()) dstFile.getParentFile ().mkdirs ();

                Files.copy (file, dstFile.toPath ());

                return FileVisitResult.CONTINUE;

            }}

        );

    } catch (IOException e) {

        return;

    }

    return;

}
