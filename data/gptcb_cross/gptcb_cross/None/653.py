def start (primaryStage):
    htmlEditor = HTMLEditor ()
    primaryStage.setScene (Scene (htmlEditor))
    primaryStage.show ()
    while (htmlEditor.lookup (".tool-bar")):
        toolBar = htmlEditor.lookup (".tool-bar")
        Pane (toolBar.getParent ()).getChildren ().remove (toolBar)