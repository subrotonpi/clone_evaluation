static void copyFolder (File src, File dest) {

    if (src == null || dest == null) return;

    if (! src.isDirectory ()) return;

    if (dest.exists ()) {

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

                if (dstFile.exists ()) return FileVisitResult.CONTINUE;

                if (! dstFile.getParentFile ().exists ()) dstFile.getParentFile ().mkdirs ();


                return FileVisitResult.CONTINUE;

            }}

        );

    } catch (IOException e) {

        return;

    }

    return;

}
