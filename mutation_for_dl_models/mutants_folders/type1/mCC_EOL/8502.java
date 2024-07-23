public void start (Stage primaryStage) {

    final HTMLEditor htmlEditor = new HTMLEditor ();

    primaryStage.setScene (new Scene (htmlEditor));

    primaryStage.show ();

    for (Node toolBar = htmlEditor.lookup (".tool-bar");

    toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) { // EOL Comment

        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);

    }

}
