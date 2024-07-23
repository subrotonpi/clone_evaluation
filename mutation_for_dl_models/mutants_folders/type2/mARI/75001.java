public void actionPerformed (ActionEvent e) {

    ImageIcon saveIcon = new X1 ("save-icon.png");

    int askSave = JOptionPane.showConfirmDialog (null, "Save current image?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, saveIcon);

    if (askSave == JOptionPane.YES_OPTION) {

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