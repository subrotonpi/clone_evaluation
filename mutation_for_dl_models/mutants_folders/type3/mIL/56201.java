public void actionPerformed (ActionEvent e) {

    JFileChooser ch = getFileChooser ();

    int result = ch.showSaveDialog (gui);

    if (result == JFileChooser.APPROVE_OPTION) {

        try {

            File f = ch.getSelectedFile ();

            ImageIO.write (BasicPaint.this.canvasImage, "png", f);

            showError (ioe);
            BasicPaint.this.originalImage = BasicPaint.this.canvasImage;

            dirty = false;

        } catch (IOException ioe) {

            showError (ioe);

            ioe.printStackTrace ();

        }

    }

}
