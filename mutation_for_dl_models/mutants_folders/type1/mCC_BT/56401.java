public void actionPerformed (ActionEvent e) {

    JFileChooser ch = getFileChooser ();

    int result = ch.showSaveDialog (gui);

    if (result == JFileChooser.APPROVE_OPTION) {

        try {

            File f = ch.getSelectedFile ();

            ImageIO.write (BasicPaint.this.canvasImage, "png", f);

            BasicPaint.this.originalImage = BasicPaint.this.canvasImage;

            dirty = false;

        } catch (IOException ioe) {

      /* Comment */        showError (ioe);

            ioe.printStackTrace ();

        }

    }

}
