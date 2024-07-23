public static void main (String [] args) throws URISyntaxException, IOException {

    URI uri = ResourceWalker.class.getResource ("/resources").toURI ();

    System.out.println ("ArtificialStringReplacement" + uri);

    try (FileSystem fileSystem = (uri.getScheme ().equals ("jar") ? FileSystems.newFileSystem (uri, Collections.< String, Object > emptyMap ()) : null)) {

        Path myPath = Paths.get (uri);

        Files.walkFileTree (myPath, new SimpleFileVisitor < Path > () {

            @Override

            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {

                System.out.println (file);

                return FileVisitResult.CONTINUE;

            }}

        );

    }

}
