public void actionPerformed (ActionEvent arg0) {

    int result = JOptionPane.OK_OPTION;

    if (dirty) {

        result = JOptionPane.showConfirmDialog (gui, "ArtificialStringReplacement");

    }

    if (result == JOptionPane.OK_OPTION) {

        clear (canvasImage);

    }

}
