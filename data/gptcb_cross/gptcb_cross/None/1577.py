def changed(observableValue, state, newState):
    if newState == Worker.State.SUCCEEDED:
        dialog.show()
        dialog.toFront()