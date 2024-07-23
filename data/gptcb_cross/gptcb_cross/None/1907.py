def start(primaryStage):
    alert = Alert (Alert.AlertType.CONFIRMATION)
    alert.setTitle("Title")
    alert.setHeaderText("Some Text")
    alert.setContentText("Choose your option.")
    buttonTypeOne = ButtonType("Yes")
    alert.initModality(Modality.NONE)
    buttonTypeCancel = ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE)
    alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeCancel)
    b = Button("close alert")
    b.setOnAction(lambda event: 
        for bt in alert.getDialogPane().getButtonTypes():
            print("bt = " + bt)
            if bt.getButtonData() == ButtonBar.ButtonData.CANCEL_CLOSE:
                cancelButton = alert.getDialogPane().lookupButton(bt)
                cancelButton.fire()
                break)
    scene = Scene(Group(b), 400, 300)
    primaryStage.setScene(scene)
    primaryStage.show()
    result = alert.showAndWait()
    if result.get() == buttonTypeOne:
        print("one")
    elif result.get() == buttonTypeCancel:
        print("cancel")