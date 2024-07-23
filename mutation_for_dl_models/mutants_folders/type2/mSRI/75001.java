public void actionPerformed (ActionEvent e) {

    ImageIcon saveIcon = new ImageIcon ("save-icon.png");

    int askSave = X1.showConfirmDialog (null, "Save current image?", "", X1.YES_NO_OPTION, X1.QUESTION_MESSAGE, saveIcon);

    if (askSave == X1.YES_OPTION) {

        saveImage ();

        Picture p = new Picture ();

        imageLabel.setIcon (new ImageIcon (image));

        frame.setSize (width (), height ());

    } else {

        Picture p = new Picture ();

        imageLabel.setIcon (new ImageIcon (image));

        frame.setSize (width (), height ());

    }

}
