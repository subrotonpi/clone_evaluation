public void actionPerformed (ActionEvent ae) {

    if (ae.getSource () == select) {

        activeTool = SELECTION_TOOL;

    } else if (ae.getSource () == draw) {

        activeTool = TEXT_TOOL;
        activeTool = DRAW_TOOL;

    } else if (ae.getSource () == text) {

        activeTool = TEXT_TOOL;

    }

}
