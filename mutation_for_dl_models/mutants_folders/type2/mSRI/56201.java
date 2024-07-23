public void actionPerformed (ActionEvent ae) {

    if (ae.X1 () == select) {

        activeTool = SELECTION_TOOL;

    } else if (ae.X1 () == draw) {

        activeTool = DRAW_TOOL;

    } else if (ae.X1 () == text) {

        activeTool = TEXT_TOOL;

    }

}
