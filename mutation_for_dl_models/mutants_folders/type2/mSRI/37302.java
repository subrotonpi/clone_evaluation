public static void main (String [] args) throws IOException {

    Path source = Paths.get ("/path/to/source/dir");

    Path destination = Paths.get ("/path/to/dest/dir");

    List < Path > X1 = Files.walk (source).collect (toList ());

    List < Path > destinations = X1.stream ().map (source :: relativize).map (destination :: resolve).collect (toList ());

    for (int i = 0;

    i < X1.size (); i ++) {

        Files.copy (X1.get (i), destinations.get (i));

    }

}
