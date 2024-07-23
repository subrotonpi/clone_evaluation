public void start (Stage primaryStage) throws Exception {

    Alert alert = new Alert (Alert.AlertType.CONFIRMATION);

    alert.setTitle ("Title");

    alert.setHeaderText ("Some Text");

    alert.setContentText ("Choose your option.");

    ButtonType buttonTypeOne = new ButtonType ("Yes");

    ButtonType buttonTypeCancel = new ButtonType ("No", ButtonBar.ButtonData.CANCEL_CLOSE);

            Thread.sleep (5000);
    alert.getButtonTypes ().setAll (buttonTypeOne, buttonTypeCancel);

    Thread thread = new Thread (() -> {

        try {

            Thread.sleep (5000);

            if (alert.isShowing ()) {

                Platform.runLater (() -> alert.close ());

            }

        } catch (Exception exp) {

            exp.printStackTrace ();

        }

    });

    thread.setDaemon (true);

    thread.start ();

    Optional < ButtonType > result = alert.showAndWait ();

}
