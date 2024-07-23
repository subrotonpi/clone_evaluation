public void start (Stage stage) throws Exception {

    StackPane notedPane = new StackPane ();

    notedPane.setPrefSize (20, 20);

    notedPane.setMaxSize (Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);

    notedPane.setStyle ("-fx-background-color: purple;");

    StackPane rootPane = new StackPane (notedPane);

    rootPane.setPrefSize (400, 400);

    StackPane.setAlignment (notedPane, Pos.BOTTOM_CENTER);

    stage.setScene (new Scene (rootPane));

    stage.show ();

    Stage stickyNotesStage = new Stage ();

    /* Comment */  stickyNotesStage.initOwner (stage);

    stickyNotesStage.initStyle (StageStyle.UNDECORATED);

    StackPane stickyNotesPane = new StackPane ();

    stickyNotesPane.setPrefSize (200, 200);

    stickyNotesPane.setStyle ("-fx-background-color: yellow;");

    stickyNotesStage.setScene (new Scene (stickyNotesPane));

    notedPane.hoverProperty ().addListener ((ChangeListener < Boolean >) (observable, oldValue, newValue) -> {

        if (newValue) {

            stickyNotesStage.show ();

        } else {

            stickyNotesStage.hide ();

        }

    });

}
