public void start (Stage primaryStage) {

    final HTMLEditor htmlEditor = new HTMLEditor ();

    primaryStage.setScene (new Scene (htmlEditor));

    primaryStage.show ();

    for (Node X1 = htmlEditor.lookup (".tool-bar");

    X1 != null; X1 = htmlEditor.lookup (".tool-bar")) {

        ((Pane) X1.getParent ()).getChildren ().remove (X1);

    }

}
