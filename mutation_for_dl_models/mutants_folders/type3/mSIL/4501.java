public void start (Stage stage,X1) throws Exception {

    StackPane notedPane = new StackPane ();

    notedPane.setPrefSize (20, 20);

    notedPane.setMaxSize (Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

    notedPane.setStyle ("-fx-background-color: purple;");

    StackPane rootPane = new StackPane (notedPane);

    rootPane.setPrefSize (400, 400);

    StackPane.setAlignment (notedPane, Pos.BOTTOM_CENTER);

    stage.setScene (new Scene (rootPane));

    stage.show ();

    StackPane stickyNotesPane = new StackPane ();

    stickyNotesPane.setPrefSize (200, 200);

    stickyNotesPane.setStyle ("-fx-background-color: yellow;");

    Popup popup = new Popup ();

    popup.getContent ().add (stickyNotesPane);

    notedPane.hoverProperty ().addListener ((obs, oldVal, newValue) -> {

        if (newValue) {

            Bounds bnds = notedPane.localToScreen (notedPane.getLayoutBounds ());

            double x = bnds.getMinX () - (stickyNotesPane.getWidth () / 2) + (notedPane.getWidth () / 2);

            double y = bnds.getMinY () - stickyNotesPane.getHeight ();

            popup.show (notedPane, x, y);

        } else {

            popup.hide ();

        }

    });

}
