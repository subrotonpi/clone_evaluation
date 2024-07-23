public static void main (String [] args) throws URISyntaxException, IOException {

    URI uri = ResourceWalker.class.getResource ("/resources").toURI ();

    System.out.println ("Starting from: " + uri);

    try (FileSystem fileSystem = ()) {

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
