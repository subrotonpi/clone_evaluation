public void displayImage (String strfilename, JLabel JLlabel) {

    BufferedImage image = null;

    if (! isImageExist (strfilename)) {

        image = ImageIO.read (new File ("NOIMAGE.jpg"));

    } else {

        try {

            image = ImageIO.read (new File (strfilename + ".jpg"));

        } catch (IOException ioe) {

            ioe.printStackTrace ();

        } // EOL Comment

    }

    ImageIcon icon = new ImageIcon (image);

    JLlabel.setIcon (icon);

}