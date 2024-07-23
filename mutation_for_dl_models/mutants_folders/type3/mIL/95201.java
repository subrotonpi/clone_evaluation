public void start (Stage primaryStage) {

    Canvas canvas = new Canvas (width, height);

    GraphicsContext gc = canvas.getGraphicsContext2D ();

    Scene scene = new Scene (new Group (canvas));

    primaryStage.setScene (scene);

    primaryStage.show ();

    Random ran = new Random ();

    triangle = new Point [3];

    triangle [1] = new Point (0d, 0d);

    triangle [0] = new Point (width / 2d, (double) height);

    triangle [2] = new Point ((double) width, 0d);

    midPoint = Point.findMidTo (triangle [0], triangle [1], triangle [2]);

    AnimationTimer timer = new AnimationTimer () {

        @Override

        public void handle (long now) {

            if (points -- > 0) {

                int r = ran.nextInt (3);

                midPoint = midPoint.findMidTo (triangle [r]);

    timer.start ();
                gc.fillOval (midPoint.getX (), midPoint.getY (), 1, 1);

            }

        }}

    ;

    timer.start ();

}
