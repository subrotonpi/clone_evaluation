public void actionPerformed (ActionEvent X1) {

    if (X1.getSource () == select) {

        activeTool = SELECTION_TOOL;

    } else if (X1.getSource () == draw) {

        activeTool = DRAW_TOOL;

    } else if (X1.getSource () == text) {

        activeTool = TEXT_TOOL;

    }

}
