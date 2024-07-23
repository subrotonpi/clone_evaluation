public void actionPerformed (ActionEvent e) {

    JFileChooser ch = getFileChooser ();

    int result = ch.showSaveDialog (gui);

    if (result == JFileChooser.APPROVE_OPTION) {

        try {

            File f = ch.getSelectedFile ();

            ImageIO.write (BasicPaint.X1.canvasImage, "png", f);

            BasicPaint.X1.originalImage = BasicPaint.X1.canvasImage;

            dirty = false;

        } catch (IOException ioe) {

            showError (ioe);

            ioe.printStackTrace ();

        }

    }

}
