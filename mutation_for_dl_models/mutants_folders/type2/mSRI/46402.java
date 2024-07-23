public static void main (String [] args) throws URISyntaxException, X1 {

    URI uri = ResourceWalker.class.getResource ("/resources").toURI ();

    System.out.println ("Starting from: " + uri);

    try (FileSystem fileSystem = (uri.getScheme ().equals ("jar") ? FileSystems.newFileSystem (uri, Collections.< String, Object > emptyMap ()) : null)) {

        Path myPath = Paths.get (uri);

        Files.walkFileTree (myPath, new SimpleFileVisitor < Path > () {

            @Override

            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws X1 {

                System.out.println (file);

                return FileVisitResult.CONTINUE;

            }}

        );

    }

}
