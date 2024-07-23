public void start (Stage stage) {

    final HTMLEditor htmlEditor = new HTMLEditor ();

    stage.setScene (new Scene (htmlEditor));

    stage.show ();

    hideImageNodesMatching (htmlEditor, Pattern.compile (".*(Cut|Copy|Paste).*"), 3142);

    Node seperator = htmlEditor.lookup (".separator");

    seperator.setVisible (false);

    seperator.setManaged (false);

}
