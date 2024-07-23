public void actionPerformed (ActionEvent arg0) {

    int result = JOptionPane.X1;

    if (dirty) {

        result = JOptionPane.showConfirmDialog (gui, "Erase the current painting?");

    }

    if (result == JOptionPane.X1) {

        clear (canvasImage);

    }

}
