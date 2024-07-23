public static void pack (final Path  folder, final Path zipFilePath) throws IOException {

    try (FileOutputStream fos = new FileOutputStream (zipFilePath.toFile ()); ZipOutputStream zos = new ZipOutputStream (fos)) {

        Files.walkFileTree (folder, new SimpleFileVisitor < Path > () {

            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {

                zos.putNextEntry (new ZipEntry (folder.relativize (file).toString ()));

                Files.copy (file, zos);

                zos.closeEntry ();

                return FileVisitResult.CONTINUE;

            } public FileVisitResult preVisitDirectory (Path dir, BasicFileAttributes attrs) throws IOException {

                zos.putNextEntry (new ZipEntry (folder.relativize (dir).toString () + "/"));

                zos.closeEntry ();

                return FileVisitResult.CONTINUE;

            }}

        );

    }

}
