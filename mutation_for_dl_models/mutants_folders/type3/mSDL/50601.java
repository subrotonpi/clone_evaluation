public void displayImage (String strfilename, JLabel label) {

    try {

        BufferedImage image = ImageIO.read (new File (strfilename + ".jpg"));

        ImageIcon icon = new ImageIcon (image);

        label.setIcon ();

    } catch (IOException | NullPointerException ex) {

        ImageIcon icon = new ImageIcon ("NOIMAGE.jpg");

        label.setIcon (icon);

    }

}
