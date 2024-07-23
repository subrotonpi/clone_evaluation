public void start (Stage stage) throws Exception {

    StackPane X1 = new StackPane ();

    X1.setPrefSize (20, 20);

    X1.setMaxSize (Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

    X1.setStyle ("-fx-background-color: purple;");

    StackPane rootPane = new StackPane (X1);

    rootPane.setPrefSize (400, 400);

    StackPane.setAlignment (X1, Pos.BOTTOM_CENTER);

    stage.setScene (new Scene (rootPane));

    stage.show ();

    StackPane stickyNotesPane = new StackPane ();

    stickyNotesPane.setPrefSize (200, 200);

    stickyNotesPane.setStyle ("-fx-background-color: yellow;");

    Popup popup = new Popup ();

    popup.getContent ().add (stickyNotesPane);

    X1.hoverProperty ().addListener ((obs, oldVal, newValue) -> {

        if (newValue) {

            Bounds bnds = X1.localToScreen (X1.getLayoutBounds ());

            double x = bnds.getMinX () - (stickyNotesPane.getWidth () / 2) + (X1.getWidth () / 2);

            double y = bnds.getMinY () - stickyNotesPane.getHeight ();

            popup.show (X1, x, y);

        } else {

            popup.hide ();

        }

    });

}
