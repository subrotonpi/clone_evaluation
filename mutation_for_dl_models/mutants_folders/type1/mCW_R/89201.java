@Override

public void start (Stage stage) throws Exception {

    FXMLLoader loader = new FXMLLoader (getClass ().getResource ("/sample/screen.fxml"));

    AnchorPane shadowPane = loader.load ();

    AnchorPane rootPane = (AnchorPane) shadowPane.lookup ("#rootPane");

    rootPane.setStyle ("-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.4), 10, 0.5, 0.0, 0.0);" + "-fx-background-color: white;");

    Scene scene = new Scene (shadowPane);

    stage.setScene (scene);

    shadowPane.setBorder (new Border (new BorderStroke (Color.RED,BorderStrokeStyle.SOLID, null, null)));

    shadowPane.setStyle ("-fx-background-color: transparent;");

    scene.setFill (Color.TRANSPARENT);

    stage.initStyle (StageStyle.TRANSPARENT);

    stage.show ();

}
