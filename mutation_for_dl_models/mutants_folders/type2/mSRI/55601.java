public void actionPerformed (ActionEvent arg0) {

    int X1 = JOptionPane.OK_OPTION;

    if (dirty) {

        X1 = JOptionPane.showConfirmDialog (gui, "Erase the current painting?");

    }

    if (X1 == JOptionPane.OK_OPTION) {

        clear (canvasImage);

    }

}
