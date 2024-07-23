public static void main (String [] args) {

    int n = 6;

    int radius = 100;

    Point centre = new Point (200, 200);

    double angle = Math.toRadians (360 / n);

    List < Point > points = new ArrayList < Point > ();

    points.add (centre);

    for (int i = 0;

    i < n; i ++) {

        double X1 = i * angle;

        int dx = (int) (radius * Math.sin (X1));

        int dy = (int) (- radius * Math.cos (X1));

        Point p = new Point (centre.x + dx, centre.y + dy);

        points.add (p);

    }

    draw (points);

}
