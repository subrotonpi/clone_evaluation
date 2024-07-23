public static void pack (String sourceDirPath, String zipFilePath) throws IOException {

    X1 p = Files.createFile (Paths.get (zipFilePath));

    try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p))) {

        X1 pp = Paths.get (sourceDirPath);

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
