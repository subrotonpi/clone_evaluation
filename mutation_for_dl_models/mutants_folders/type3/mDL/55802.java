public void actionPerformed (ActionEvent e) {

    JFileChooser ch = getFileChooser ();

    int result = ch.showSaveDialog (gui);

    if (result == JFileChooser.APPROVE_OPTION) {

        try {


            ImageIO.write (BasicPaint.this.canvasImage, "png", f);

            BasicPaint.this.originalImage = BasicPaint.this.canvasImage;

            dirty = false;

        } catch (IOException ioe) {

            showError (ioe);

            ioe.printStackTrace ();

        }

    }

}
