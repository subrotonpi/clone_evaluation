def start(stage):
    noted_pane = StackPane()
    noted_pane.setPrefSize(20,20)
    noted_pane.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE)
    noted_pane.setStyle("-fx-background-color: purple;")
    root_pane = StackPane(noted_pane)
    root_pane.setPrefSize(400,400)
    StackPane.setAlignment(noted_pane,Pos.BOTTOM_CENTER)
    stage.setScene(Scene(root_pane))
    stage.show()
    sticky_notes_stage = Stage()
    sticky_notes_stage.initOwner(stage)
    sticky_notes_stage.initStyle(StageStyle.UNDECORATED)
    sticky_notes_pane = StackPane()
    sticky_notes_pane.setPrefSize(200, 200)
    sticky_notes_pane.setStyle("-fx-background-color: yellow;")
    sticky_notes_stage.setScene(Scene(sticky_notes_pane))
    noted_pane.hoverProperty().addListener((ChangeListener<Boolean>)(observable, oldValue, newValue) -> {
        if (newValue): 
            sticky_notes_stage.show()
        else:
            sticky_notes_stage.hide()