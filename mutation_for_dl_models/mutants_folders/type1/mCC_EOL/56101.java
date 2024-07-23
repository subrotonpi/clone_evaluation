public void actionPerformed (ActionEvent ae) {

    if (ae.getSource () == select) {
 // EOL Comment
        activeTool = SELECTION_TOOL;

    } else if (ae.getSource () == draw) {

        activeTool = DRAW_TOOL;

    } else if (ae.getSource () == text) {

        activeTool = TEXT_TOOL;

    }

}
