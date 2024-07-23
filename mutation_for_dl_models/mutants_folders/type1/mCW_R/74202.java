public static void deleteDirectory (String directoryFilePath) throws IOException {

    Path directory = Paths.get (directoryFilePath);

    if (Files.exists (directory)) {

        Files.walkFileTree (directory, new SimpleFileVisitor < Path > () {

            @Override

            public FileVisitResult visitFile (Path path, BasicFileAttributes basicFileAttributes) throws IOException {

                Files.delete (path);

                return FileVisitResult.CONTINUE;

            }@Override

            public FileVisitResult postVisitDirectory(Path directory, IOException ioException) throws IOException {

                Files.delete (directory);

                return FileVisitResult.CONTINUE;

            }}

        );

    }

}
