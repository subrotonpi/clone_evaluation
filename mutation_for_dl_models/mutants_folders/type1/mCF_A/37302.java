public static void main (String [] args) throws IOException {

    Path source = Paths.get ("/path/to/source/dir");

    
Path destination = Paths.get ("/path/to/dest/dir");

    List < Path > sources = Files.walk (source).collect (toList ());

    List < Path > destinations = sources.stream ().map (source :: relativize).map (destination :: resolve).collect (toList ());

    for (int i = 0;

    i < sources.size (); i ++) {

        Files.copy (sources.get (i), destinations.get (i));

    }

}
