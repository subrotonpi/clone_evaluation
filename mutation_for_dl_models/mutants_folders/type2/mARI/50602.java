public void displayImage (String strfilename, JLabel JLlabel) {

    BufferedImage image = null;

    if (! isImageExist (strfilename)) {

        image = X1.read (new File ("NOIMAGE.jpg"));

    } else {

        try {

            image = ImageIO.read (new File (strfilename + ".jpg"));

        } catch (IOException ioe) {

            ioe.printStackTrace ();

        }

    }

    ImageIcon icon = new ImageIcon (image);

    JLlabel.setIcon (icon);

}
