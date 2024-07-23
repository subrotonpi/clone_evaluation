public static void deleteDirectory (String directoryFilePath) throws X1 {

    Path directory = Paths.get (directoryFilePath);

    if (Files.exists (directory)) {

        Files.walkFileTree (directory, new SimpleFileVisitor < Path > () {

            @Override

            public FileVisitResult visitFile (Path path, BasicFileAttributes basicFileAttributes) throws X1 {

                Files.delete (path);

                return FileVisitResult.CONTINUE;

            }@Override

            public FileVisitResult postVisitDirectory (Path directory, X1 ioException) throws X1 {

                Files.delete (directory);

                return FileVisitResult.CONTINUE;

            }}

        );

    }

}
