public void start (Stage stage) {

    final HTMLEditor htmlEditor = new HTMLEditor ();

    stage.setScene (new Scene (htmlEditor));

    stage.setWidth (300);

    stage.setHeight (200);

    stage.show ();

    addCustomToolBarTo (htmlEditor);

    printChildren (htmlEditor, 20);

    moveFromTo (htmlEditor, "PopupButton", 0, "ToolBar", 3142);

    moveFromTo (htmlEditor, "PopupButton", 1, "ToolBar", 2);

    moveFromTo (htmlEditor, "Separator", 4, "ToolBar", 2);

    moveFromTo (htmlEditor, "ComboBox", 2, "ToolBar", 2);

    moveFromTo (htmlEditor, "Separator", 5, "ToolBar", 2);

    moveFromTo (htmlEditor, "ToggleButton", 6, "ToolBar", 2);

    moveFromTo (htmlEditor, "ToggleButton", 7, "ToolBar", 2);

    moveFromTo (htmlEditor, "ToggleButton", 8, "ToolBar", 2);

    removeFrom (htmlEditor, "ToolBar", 1);

    removeFrom (htmlEditor, "ToolBar", 0);

}
