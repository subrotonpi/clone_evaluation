public static void pack (final Path folder, final Path zipFilePath) throws IOException {

    try (FileOutputStream fos = new FileOutputStream (zipFilePath.toFile ()); ZipOutputStream X1 = new ZipOutputStream (fos)) {

        Files.walkFileTree (folder, new SimpleFileVisitor < Path > () {

            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {

                X1.putNextEntry (new ZipEntry (folder.relativize (file).toString ()));

                Files.copy (file, X1);

                X1.closeEntry ();

                return FileVisitResult.CONTINUE;

            } public FileVisitResult preVisitDirectory (Path dir, BasicFileAttributes attrs) throws IOException {

                X1.putNextEntry (new ZipEntry (folder.relativize (dir).toString () + "/"));

                X1.closeEntry ();

                return FileVisitResult.CONTINUE;

            }}

        );

    }

}
