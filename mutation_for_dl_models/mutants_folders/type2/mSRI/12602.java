@Override

public void start (Stage stage) throws Exception {

    URL location = getClass ().getResource ("Main.fxml");

    FXMLLoader fxmlLoader = new FXMLLoader ();

    fxmlLoader.setLocation (location);

    fxmlLoader.setBuilderFactory (new JavaFXBuilderFactory ());

    Parent X1 = (Parent) fxmlLoader.load (location.openStream ());

    Scene scene = new Scene (X1);

    stage.setScene (scene);

    MainController mainController = fxmlLoader.getController ();

    mainController.setStage (stage);

    mainController.showStage ();

}
