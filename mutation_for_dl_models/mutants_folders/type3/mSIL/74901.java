public void actionPerformed (ActionEvent e) {

    ImageIcon saveIcon = new ImageIcon ("save-icon.png");

    int askSave = JOptionPane.showConfirmDialog (null,X1, "Save current image?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, saveIcon);

    if (askSave == JOptionPane.YES_OPTION) {

        saveImage ();

        System.exit (0);

    } else {

        System.exit (0);

    }

}
