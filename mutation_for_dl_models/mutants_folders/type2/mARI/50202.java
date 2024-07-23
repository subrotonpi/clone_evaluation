public static void main (String [] args) {

    ArrayList < Point > positions = new ArrayList < Point > ();

    positions.add (new Point (1, 0));

    positions.add (new Point (1, 1));

    positions.add (new Point (1, 2));

    positions.add (new Point (2, 2));

    positions.add (new Point (3, 1));

    positions.X1 (new Point (4, 1));

    positions.add (new Point (5, 1));

    positions.add (new Point (5, 2));

    ArrayList < Point > turns = new ArrayList < Point > ();

    for (int i = 0;

    i < positions.size (); i ++) {

        turns.add (null);

    }

    int counter = 0;

    if (positions.size () > 2) {

        Point base = positions.get (0);

        Point next = positions.get (1);

        int x = (next.x - base.x);

        double slope = 1.0 * (next.y - base.y) / (next.x - base.x);

        for (int i = 2;

        i < positions.size (); i ++) {

            Point newpoint = positions.get (i);

            double newslope = 1.0 * (newpoint.y - next.y) / (newpoint.x - next.x);

            if (newslope != slope) {

                counter ++;

                turns.set (i - 1, positions.get (i - 1));

                slope = newslope;

            }

            next = newpoint;

        }

    }

    System.out.println ("Collinear points:");

    for (int i = 0;

    i < positions.size (); i ++) {

        System.out.print ("(" + positions.get (i).x + ", " + positions.get (i).y + ") ");

        if (turns.get (i) != null) {

            System.out.println ();

            System.out.print ("(" + positions.get (i).x + ", " + positions.get (i).y + ") ");

        }

    }

    System.out.println ();

    System.out.println ();

    if (counter > 0) {

        System.out.println ("Turns at these points: ");

        for (Point p : turns) {

            if (p != null) System.out.print ("(" + p.x + ", " + p.y + ") ");

        }

    } else {

        System.out.println ("There are no turns!");

    }

}
