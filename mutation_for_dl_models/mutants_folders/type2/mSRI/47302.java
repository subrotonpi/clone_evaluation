public static void pack (String sourceDirPath, String zipFilePath) throws IOException {

    Path p = Files.createFile (Paths.get (zipFilePath));

    Path pp = Paths.get (sourceDirPath);

    try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p)); Stream < Path > paths = Files.walk (pp)) {

        paths.filter (X1 -> ! Files.isDirectory (X1)).forEach (X1 -> {

            ZipEntry zipEntry = new ZipEntry (pp.relativize (X1).toString ());

            try {

                zs.putNextEntry (zipEntry);

                Files.copy (X1, zs);

                zs.closeEntry ();

            } catch (IOException e) {

                System.err.println (e);

            }

        });

    }

}
