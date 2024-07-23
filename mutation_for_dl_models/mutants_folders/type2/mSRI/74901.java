public void actionPerformed (ActionEvent e) {

    ImageIcon saveIcon = new ImageIcon ("save-icon.png");

    int askSave = X1.showConfirmDialog (null, "Save current image?", "", X1.YES_NO_OPTION, X1.QUESTION_MESSAGE, saveIcon);

    if (askSave == X1.YES_OPTION) {

        saveImage ();

        System.exit (0);

    } else {

        System.exit (0);

    }

}
