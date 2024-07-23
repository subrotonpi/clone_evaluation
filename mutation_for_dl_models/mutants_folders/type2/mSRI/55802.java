public void actionPerformed (ActionEvent e) {

    X1 ch = getFileChooser ();

    int result = ch.showSaveDialog (gui);

    if (result == X1.APPROVE_OPTION) {

        try {

            File f = ch.getSelectedFile ();

            ImageIO.write (BasicPaint.this.canvasImage, "png", f);

            BasicPaint.this.originalImage = BasicPaint.this.canvasImage;

            dirty = false;

        } catch (IOException ioe) {

            showError (ioe);

            ioe.printStackTrace ();

        }

    }

}
