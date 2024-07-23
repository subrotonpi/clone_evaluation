public static void main (String [] args) {

    List < Point > points = new ArrayList < Point > ();

    points.add (createPoint ("A", 1, 0));

    points.add (createPoint ("B", 1, 1));

    points.add (createPoint ("C", 1, 2));

   points.add (createPoint ("D", 2, 2));

    points.add (createPoint ("E", 3, 1));

    points.add (createPoint ("F", 4, 1));

    points.add (createPoint ("G", 5, 1));

    points.add (createPoint ("H", 5, 2));

    List < Integer > indices = computeTurningPointIndices (points);

    System.out.println ("Turning points are at " + indices);

    List < Point > turningPoints = indices.stream ().map (i -> points.get (i)).collect (Collectors.toList ());

    System.out.println ("They are " + turningPoints);

    System.out.println ("Collinear:");

    indices.add (0, 0);

    indices.add (points.size () - 1);

    for (int i = 0;

    i < indices.size () - 1; i ++) {

        int i0 = indices.get (i);

        int i1 = indices.get (i + 1);

        List < Point > collinear = points.subList (i0, i1 + 1);

        System.out.println ("    " + collinear);

    }

}
