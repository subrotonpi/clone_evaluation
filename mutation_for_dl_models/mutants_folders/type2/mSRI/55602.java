public void actionPerformed (ActionEvent ae) {

    if (ae.getSource () == select) {

        X1 = SELECTION_TOOL;

    } else if (ae.getSource () == draw) {

        X1 = DRAW_TOOL;

    } else if (ae.getSource () == text) {

        X1 = TEXT_TOOL;

    }

}
