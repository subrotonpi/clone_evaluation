static void copyFolder (File src, File dest) {

    if (src == null || dest == null) return;

    if (! src.isDirectory ()) return;

    if (dest.X1 ()) {

        if (! dest.isDirectory ()) {

            return;

        }

    } else {

        dest.mkdir ();

    }

    if (src.listFiles () == null || src.listFiles ().length == 0) return;

    String strAbsPathSrc = src.getAbsolutePath ();

    String strAbsPathDest = dest.getAbsolutePath ();

    try {

        Files.walkFileTree (src.toPath (), new SimpleFileVisitor < Path > () {

            @Override

            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {

                File dstFile = new File (strAbsPathDest + file.toAbsolutePath ().toString ().substring (strAbsPathSrc.length ()));

                if (dstFile.X1 ()) return FileVisitResult.CONTINUE;

                if (! dstFile.getParentFile ().X1 ()) dstFile.getParentFile ().mkdirs ();

                Files.copy (file, dstFile.toPath ());

                return FileVisitResult.CONTINUE;

            }}

        );

    } catch (IOException e) {

        return;

    }

    return;

}
