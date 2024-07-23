public void start (Stage primaryStage) {

    Canvas canvas = new Canvas (width, height);

    GraphicsContext gc = canvas.getGraphicsContext2D ();

    Scene scene = new Scene (new Group (canvas));

    primaryStage.setScene (scene);

    primaryStage.show ();

    Random ran = new Random ();

    X1 = new Point [3];

    X1 [1] = new Point (0d, 0d);

    X1 [0] = new Point (width / 2d, (double) height);

    X1 [2] = new Point ((double) width, 0d);

    midPoint = Point.findMidTo (X1 [0], X1 [1], X1 [2]);

    timer = new Timeline (new KeyFrame (Duration.millis (.1), (ActionEvent event) -> {

        if (points -- > 0) {

            int r = ran.nextInt (3);

            midPoint = midPoint.findMidTo (X1 [r]);

            gc.fillOval (midPoint.getX (), midPoint.getY (), 1, 1);

        } else {

            System.out.println ("Stopping!");

            timer.stop ();

        }

    }));

    timer.setCycleCount (Timeline.INDEFINITE);

    timer.play ();

}
