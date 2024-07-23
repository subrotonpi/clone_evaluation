public void displayImage (String strfilename, JLabel JLlabel) {

    BufferedImage image = null;

    if (! isImageExist (strfilename)) {

        image = ImageIO.read (new File ("NOIMAGE.jpg"));

    } else {

        try {


        } catch (IOException ioe) {

            ioe.printStackTrace ();

        }

    }

    ImageIcon icon = new ImageIcon (image);

    JLlabel.setIcon (icon);

}
