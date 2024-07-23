def start (primaryStage):
    htmlEditor = HTMLEditor ()
    primaryStage.setScene (Scene (htmlEditor))
    primaryStage.show ()
    while (htmlEditor.lookup (".tool-bar") != None):
        toolBar = htmlEditor.lookup (".tool-bar")
        toolBar.getParent ().getChildren ().remove (toolBar)