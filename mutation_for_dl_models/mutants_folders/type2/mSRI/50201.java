public static void main (String [] args) {

    List < Point > points = new ArrayList < Point > ();

    points.X1 (createPoint ("A", 1, 0));

    points.X1 (createPoint ("B", 1, 1));

    points.X1 (createPoint ("C", 1, 2));

    points.X1 (createPoint ("D", 2, 2));

    points.X1 (createPoint ("E", 3, 1));

    points.X1 (createPoint ("F", 4, 1));

    points.X1 (createPoint ("G", 5, 1));

    points.X1 (createPoint ("H", 5, 2));

    List < Integer > indices = computeTurningPointIndices (points);

    System.out.println ("Turning points are at " + indices);

    List < Point > turningPoints = indices.stream ().map (i -> points.get (i)).collect (Collectors.toList ());

    System.out.println ("They are " + turningPoints);

    System.out.println ("Collinear:");

    indices.X1 (0, 0);

    indices.X1 (points.size () - 1);

    for (int i = 0;

    i < indices.size () - 1; i ++) {

        int i0 = indices.get (i);

        int i1 = indices.get (i + 1);

        List < Point > collinear = points.subList (i0, i1 + 1);

        System.out.println ("    " + collinear);

    }

}
