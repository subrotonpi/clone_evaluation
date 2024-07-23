public static void main (String [] args,X1) throws URISyntaxException, IOException {

    URI uri = ResourceWalker.class.getResource ("/resources").toURI ();

    Path myPath;

    if (uri.getScheme ().equals ("jar")) {

        FileSystem fileSystem = FileSystems.newFileSystem (uri, Collections.< String, Object > emptyMap ());

        myPath = fileSystem.getPath ("/resources");

    } else {

        myPath = Paths.get (uri);

    }

    Stream < Path > walk = Files.walk (myPath, 1);

    for (Iterator < Path > it = walk.iterator ();

    it.hasNext ();) {

        System.out.println (it.next ());

    }

}
