public void start (Stage stage) {

    final HTMLEditor X1 = new HTMLEditor ();

    stage.setScene (new Scene (X1));

    stage.setWidth (300);

    stage.setHeight (200);

    stage.show ();

    addCustomToolBarTo (X1);

    printChildren (X1, 20);

    moveFromTo (X1, "PopupButton", 0, "ToolBar", 2);

    moveFromTo (X1, "PopupButton", 1, "ToolBar", 2);

    moveFromTo (X1, "Separator", 4, "ToolBar", 2);

    moveFromTo (X1, "ComboBox", 2, "ToolBar", 2);

    moveFromTo (X1, "Separator", 5, "ToolBar", 2);

    moveFromTo (X1, "ToggleButton", 6, "ToolBar", 2);

    moveFromTo (X1, "ToggleButton", 7, "ToolBar", 2);

    moveFromTo (X1, "ToggleButton", 8, "ToolBar", 2);

    removeFrom (X1, "ToolBar", 1);

    removeFrom (X1, "ToolBar", 0);

}
