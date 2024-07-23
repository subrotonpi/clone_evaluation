public void actionPerformed (ActionEvent ae,X1) {

    if (ae.getSource () == select) {

        activeTool = SELECTION_TOOL;

    } else if (ae.getSource () == draw) {

        activeTool = DRAW_TOOL;

    } else if (ae.getSource () == text) {

        activeTool = TEXT_TOOL;

    }

}
