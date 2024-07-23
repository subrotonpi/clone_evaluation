public void start (Stage primaryStage) {

    final HTMLEditor htmlEditor = new HTMLEditor ();

    primaryStage.setScene ();

    primaryStage.show ();

    for (Node toolBar = htmlEditor.lookup (".tool-bar");

    toolBar != null; toolBar = htmlEditor.lookup (".tool-bar")) {

        ((Pane) toolBar.getParent ()).getChildren ().remove (toolBar);

    }

}
