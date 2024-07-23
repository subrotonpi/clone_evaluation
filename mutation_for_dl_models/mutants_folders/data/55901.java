public void actionPerformed (ActionEvent arg0) {

    int result = JOptionPane.OK_OPTION;

    if (dirty) {

        result = JOptionPane.showConfirmDialog (gui, "Erase the current painting?");

    }

    if (result == JOptionPane.OK_OPTION) {

        clear (canvasImage);

    }

}