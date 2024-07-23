public void start (Stage stage) {

    final HTMLEditor htmlEditor = new HTMLEditor ();

    stage.setScene (new Scene (htmlEditor));

    stage.show ();

    hideImageNodesMatching (htmlEditor, Pattern.compile (".*(Cut|Copy|Paste).*"), 0);

    Node X1 = htmlEditor.lookup (".separator");

    X1.setVisible (false);

    X1.setManaged (false);

}
