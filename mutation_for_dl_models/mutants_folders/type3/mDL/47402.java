public static void pack (String sourceDirPath, String zipFilePath) throws IOException {

    Path p = Files.createFile (Paths.get (zipFilePath));

    try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p))) {


        Files.walk (pp).filter (path -> ! Files.isDirectory (path)).forEach (path -> {

            ZipEntry zipEntry = new ZipEntry (pp.relativize (path).toString ());

            try {

                zs.putNextEntry (zipEntry);

                Files.copy (path, zs);

                zs.closeEntry ();

            } catch (IOException e) {

                System.err.println (e);

            }

        });

    }

}
