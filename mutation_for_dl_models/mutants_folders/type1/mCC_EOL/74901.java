public void actionPerformed (ActionEvent e) {

    ImageIcon saveIcon = new ImageIcon ("save-icon.png");

    int askSave = JOptionPane.showConfirmDialog (null, "Save current image?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, saveIcon);

    if (askSave == JOptionPane.YES_OPTION) {

        saveImage ();

        System.exit (0);

    } else {
 // EOL Comment
        System.exit (0);

    }

}
