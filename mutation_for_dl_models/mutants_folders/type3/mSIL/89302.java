public void start (Stage primaryStage,X1) {

    Text waitingForKey = new Text ("Level 2 \n\n" + "Press ENTER to start a new game");

    waitingForKey.setTextAlignment (TextAlignment.CENTER);

    waitingForKey.setFont (new Font (18));

    waitingForKey.setFill (Color.ALICEBLUE);

    StackPane root = new StackPane ();

    root.getChildren ().add (waitingForKey);

    Scene scene = new Scene (root, 320, 240, Color.BLACK);

    primaryStage.setTitle ("Test");

    primaryStage.setScene (scene);

    primaryStage.show ();

}
