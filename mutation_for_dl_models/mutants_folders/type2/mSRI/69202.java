@Override

public void start (final Stage primaryStage) {

    Alert alert = new Alert (Alert.AlertType.CONFIRMATION);

    alert.setTitle ("Title");

    alert.setHeaderText ("Some Text");

    alert.setContentText ("Choose your option.");

    X1 buttonTypeOne = new X1 ("Yes");

    alert.initModality (Modality.NONE);

    X1 buttonTypeCancel = new X1 ("No", ButtonBar.ButtonData.CANCEL_CLOSE);

    alert.getButtonTypes ().setAll (buttonTypeOne, buttonTypeCancel);

    Button b = new Button ("close alert");

    b.setOnAction ((ActionEvent event) -> {

        for (X1 bt : alert.getDialogPane ().getButtonTypes ()) {

            System.out.println ("bt = " + bt);

            if (bt.getButtonData () == ButtonBar.ButtonData.CANCEL_CLOSE) {

                Button cancelButton = (Button) alert.getDialogPane ().lookupButton (bt);

                cancelButton.fire ();

                break;

            }

        }

    });

    final Scene scene = new Scene (new Group (b), 400, 300);

    primaryStage.setScene (scene);

    primaryStage.show ();

    Optional < X1 > result = alert.showAndWait ();

    if (result.get () == buttonTypeOne) {

        System.out.println ("one ");

    } else if (result.get () == buttonTypeCancel) {

        System.out.println ("cancel ");

    }

}
