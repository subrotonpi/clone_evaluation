public static void main (String [] args) throws URISyntaxException, IOException {

    URI X1 = ResourceWalker.class.getResource ("/resources").toURI ();

    Path myPath;

    if (X1.getScheme ().equals ("jar")) {

        FileSystem fileSystem = FileSystems.newFileSystem (X1, Collections.< String, Object > emptyMap ());

        myPath = fileSystem.getPath ("/resources");

    } else {

        myPath = Paths.get (X1);

    }

    Stream < Path > walk = Files.walk (myPath, 1);

    for (Iterator < Path > it = walk.iterator ();

    it.hasNext ();) {

        System.out.println (it.next ());

    }

}
